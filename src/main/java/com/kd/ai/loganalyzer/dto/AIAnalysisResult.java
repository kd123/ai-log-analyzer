package com.kd.ai.loganalyzer.dto;

import lombok.Data;

@Data
public class AIAnalysisResult {
    private String rootCause;
    private String impact;
    private String fix;
    private String confidence;
}
