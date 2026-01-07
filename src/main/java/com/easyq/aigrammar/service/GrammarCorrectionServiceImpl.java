package com.easyq.aigrammar.service;

import org.springframework.stereotype.Service;
import com.easyq.aigrammar.client.OpenAiGrammarClient;

@Service
public class GrammarCorrectionServiceImpl implements GrammarCorrectionService {

    private final OpenAiGrammarClient client;

    public GrammarCorrectionServiceImpl(OpenAiGrammarClient client) {
        this.client = client;
    }

    @Override
    public String correctGrammar(String text) {
        return client.correctGrammar(text);
    }
}
