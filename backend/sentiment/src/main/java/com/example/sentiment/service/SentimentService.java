package com.example.sentiment.service;

import com.example.sentiment.dto.ReviewRequest;
import com.example.sentiment.dto.PredictionResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class SentimentService {

    @Autowired
    private RestTemplate restTemplate;

    private static final String PYTHON_API_URL = "http://localhost:5000/predict";

    public PredictionResponse analyzeReview(ReviewRequest request) {
        return restTemplate.postForObject(PYTHON_API_URL, request, PredictionResponse.class);
    }
}
