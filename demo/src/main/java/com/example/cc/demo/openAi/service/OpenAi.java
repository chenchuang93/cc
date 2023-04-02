package com.example.cc.demo.openAi.service;

import com.alibaba.fastjson2.JSONObject;
import com.example.cc.demo.openAi.entity.OpenAiChatCompletionsParam;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class OpenAi {
    public static final String OPENAI_URL = "https://api.openai.com/v1/chat/completions";

    public static final String API_KEY = "api key";

    private final RestTemplate restTemplate = new RestTemplate();

    public String generateImages(OpenAiChatCompletionsParam openAiChatCompletionsParam) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.set("Authorization", "Bearer " + API_KEY);
        // We are including only some of the parameters to the json request
        String requestJson = JSONObject.toJSONString(openAiChatCompletionsParam);
        HttpEntity< String > request = new HttpEntity < > (requestJson, headers);
        ResponseEntity< String > response = restTemplate.postForEntity(OPENAI_URL, request, String.class);
        return response.getBody();
    }

}
