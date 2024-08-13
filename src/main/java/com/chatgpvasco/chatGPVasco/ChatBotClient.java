package com.chatgpvasco.chatGPVasco;


import org.springframework.web.client.RestTemplate;

public class ChatBotClient {

    private static final String URL = "http://localhost:8080/chatbot/message";

    public static void main(String[] args) {
        RestTemplate restTemplate = new RestTemplate();
        String message = "Olá, ChatBot!";
        String response = restTemplate.postForObject(URL, message, String.class);
        System.out.println("Resposta do ChatBot: " + response);
    }
}
