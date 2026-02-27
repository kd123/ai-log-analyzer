package com.kd.ai.loganalyzer.client;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.kd.ai.loganalyzer.config.OpenAIConfig;
import com.kd.ai.loganalyzer.dto.AIAnalysisResult;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Map;

@Slf4j
@Component
@RequiredArgsConstructor
public class AIClient {

    private final RestTemplate restTemplate;
    private final OpenAIConfig config;
    private final ObjectMapper objectMapper;

    public AIAnalysisResult analyze(String prompt) {

        try {

            Map<String, Object> requestBody = Map.of(
                    "model", "llama-3.3-70b-versatile",
                    "messages", List.of(
                            Map.of("role", "system", "content", "You are an expert backend engineer."),
                            Map.of("role", "user", "content", prompt)
                    ),
                    "temperature", 0.2
            );

            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_JSON);
            headers.setBearerAuth(config.getApiKey());

            HttpEntity<Map<String, Object>> entity =
                    new HttpEntity<>(requestBody, headers);

            log.info("Calling AI API...");

            ResponseEntity<String> response =
                    restTemplate.exchange(
                            config.getUrl(),
                            HttpMethod.POST,
                            entity,
                            String.class
                    );

            String cleanedJson = extractContent(response.getBody());
            return objectMapper.readValue(cleanedJson, AIAnalysisResult.class);

        } catch (Exception e) {

            log.error("AI API call failed", e);
            throw new RuntimeException("AI service unavailable");

        }

    }

    private String extractContent(String responseBody) throws Exception {

        JsonNode jsonNode = objectMapper.readTree(responseBody);

        String content= jsonNode
                .get("choices")
                .get(0)
                .get("message")
                .get("content")
                .asText();
        return cleanContent(content);

    }

    private String cleanContent(String content) {

        if (content == null) {
            return null;
        }

        // Remove ```json and ```
        content = content.replaceAll("```json", "");
        content = content.replaceAll("```", "");

        return content.trim();

    }

}
