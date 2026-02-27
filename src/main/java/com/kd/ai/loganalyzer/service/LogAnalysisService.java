package com.kd.ai.loganalyzer.service;

import com.kd.ai.loganalyzer.client.AIClient;
import com.kd.ai.loganalyzer.dto.AIAnalysisResult;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LogAnalysisService {

    private final AIClient groqClient;

    public AIAnalysisResult analyzeLogs(String log) {
            String prompt = buildPrompt(log);

            return groqClient.analyze(prompt);
    }

    private String buildPrompt(String log) {

        return """ 
                    You are a senior production support engineer for Java Spring Boot microservices.
                    
                    Analyze the log and provide a precise and actionable response.
                    
                    Rules:
                    - Be specific to Spring Boot, PostgreSQL, Kafka, Redis environments
                    - Do NOT give generic advice
                    - Provide exact root cause
                    - Provide exact fix steps for backend engineer
                    - Keep response concise and production-focused
                    
                    Output format STRICTLY in JSON:
                    
                    {
                      "rootCause": "...",
                      "impact": "...",
                      "fix": "...",
                      "confidence": "HIGH | MEDIUM | LOW"
                    }
                    
                    Log:
                    """ + log;
    }

}
