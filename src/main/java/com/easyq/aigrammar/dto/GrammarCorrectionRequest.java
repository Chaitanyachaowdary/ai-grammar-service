package com.easyq.aigrammar.dto;

import jakarta.validation.constraints.NotBlank;

public class GrammarCorrectionRequest {

    @NotBlank
    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
