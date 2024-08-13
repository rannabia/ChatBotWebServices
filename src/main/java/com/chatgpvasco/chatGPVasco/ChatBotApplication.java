package com.chatgpvasco.chatGPVasco;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ChatBotApplication {

    public static void main(String[] args) {
        SpringApplication.run(ChatBotApplication.class, args);
        String testMessage = "Olá!";
        String response = ChatBot.generateResponse(testMessage);
        System.out.println("Resposta do chatbot: " + response);
    }
}
