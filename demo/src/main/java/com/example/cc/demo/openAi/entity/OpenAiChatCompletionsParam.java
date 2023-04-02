package com.example.cc.demo.openAi.entity;

import lombok.Data;

@Data
public class OpenAiChatCompletionsParam {
    private String model;
    private Messages messages;

}
