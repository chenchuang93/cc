package com.example.cc.demo.entity;

public class OpenAiChatCompletionsParam {
    private String model;
    private Messages messages;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Messages getMessages() {
        return messages;
    }

    public void setMessages(Messages messages) {
        this.messages = messages;
    }
}
