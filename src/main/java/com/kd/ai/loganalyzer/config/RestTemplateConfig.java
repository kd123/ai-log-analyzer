package com.kd.ai.loganalyzer.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateConfig {

    @Bean
    public RestTemplate restTemplate() {

        SimpleClientHttpRequestFactory factory =
                new SimpleClientHttpRequestFactory();

        // Connection timeout (milliseconds)
        factory.setConnectTimeout(5000);

        // Read timeout (milliseconds)
        factory.setReadTimeout(30000);

        return new RestTemplate(factory);

    }
}
