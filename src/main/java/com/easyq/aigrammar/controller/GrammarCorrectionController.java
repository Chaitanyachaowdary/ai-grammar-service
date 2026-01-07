package com.easyq.aigrammar.controller;

import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;
import com.easyq.aigrammar.dto.*;
import com.easyq.aigrammar.service.GrammarCorrectionService;

@RestController
@RequestMapping("/api/v1/ai/grammar")
public class GrammarCorrectionController {

    private final GrammarCorrectionService service;

    public GrammarCorrectionController(GrammarCorrectionService service) {
        this.service = service;
    }

    @PostMapping
    public GrammarCorrectionResponse correct(@Valid @RequestBody GrammarCorrectionRequest request) {
        String corrected = service.correctGrammar(request.getText());
        return new GrammarCorrectionResponse(request.getText(), corrected);
    }
}
