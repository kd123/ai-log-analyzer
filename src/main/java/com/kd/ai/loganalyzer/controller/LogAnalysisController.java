package com.kd.ai.loganalyzer.controller;

import com.kd.ai.loganalyzer.dto.AIAnalysisResult;
import com.kd.ai.loganalyzer.dto.LogRequest;
import com.kd.ai.loganalyzer.dto.LogResponse;
import com.kd.ai.loganalyzer.service.LogAnalysisService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/ai/logs")
@RequiredArgsConstructor
public class LogAnalysisController {

    private final LogAnalysisService logAnalysisService;

    @PostMapping("/analyze")
    public AIAnalysisResult analyze(@RequestBody LogRequest request) {

        return logAnalysisService.analyzeLogs(request.getLog());

//        return new LogResponse(analysis);
    }
}
