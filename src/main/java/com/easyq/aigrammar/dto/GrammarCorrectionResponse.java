package com.easyq.aigrammar.dto;

public class GrammarCorrectionResponse {

    private String originalText;
    private String correctedText;

    public GrammarCorrectionResponse(String originalText, String correctedText) {
        this.originalText = originalText;
        this.correctedText = correctedText;
    }

    public String getOriginalText() {
        return originalText;
    }

    public String getCorrectedText() {
        return correctedText;
    }
}
