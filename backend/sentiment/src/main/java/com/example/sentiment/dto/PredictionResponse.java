package com.example.sentiment.dto;

public class PredictionResponse {
    private String sentiment;

    public String getSentiment() {
        return sentiment;
    }

    public void setSentiment(String sentiment) {
        this.sentiment = sentiment;
    }
}