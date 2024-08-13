package com.chatgpvasco.chatGPVasco;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/chatbot")
public class ChatBotController {
    private final ChatBot chatBot;
    public ChatBotController() {
        this.chatBot = new ChatBot(); // Inicializa o ChatBot
    }
    @PostMapping("/message")
    public String receiveMessage(@RequestBody String message) {
        // Envia a mensagem para o ChatBot e recebe a resposta
        return chatBot.generateResponse(message);
    }

    // Endpoint de teste
    @GetMapping("/ping")
    public String ping() {
        return "ChatBot is running!";
    }
}
