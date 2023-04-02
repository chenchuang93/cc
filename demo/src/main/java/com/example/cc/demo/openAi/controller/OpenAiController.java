package com.example.cc.demo.openAi.controller;

import com.example.cc.demo.openAi.entity.OpenAiChatCompletionsParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.cc.demo.openAi.service.OpenAi;

@RestController
public class OpenAiController {

    @Autowired
    private OpenAi openAi;

    @PostMapping("/generateImages")
    public String generateImages(@RequestBody OpenAiChatCompletionsParam request) {
        return openAi.generateImages(request);
    }
}
