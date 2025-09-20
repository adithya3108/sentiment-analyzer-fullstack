package com.example.sentiment.controller;

import com.example.sentiment.dto.ReviewRequest;
import com.example.sentiment.dto.PredictionResponse;
import com.example.sentiment.service.SentimentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/sentiment")
@CrossOrigin(origins = "*") // allow frontend access
public class SentimentController {

    @Autowired
    private SentimentService sentimentService;

    @PostMapping("/analyze")
    public PredictionResponse analyzeReview(@RequestBody ReviewRequest request) {
        return sentimentService.analyzeReview(request);
    }
}
