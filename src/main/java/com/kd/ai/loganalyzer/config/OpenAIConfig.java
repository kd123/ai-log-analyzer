package com.kd.ai.loganalyzer.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
@ConfigurationProperties(prefix = "ai.openai")
public class OpenAIConfig {

    private String apiKey;
    private String url;

}
