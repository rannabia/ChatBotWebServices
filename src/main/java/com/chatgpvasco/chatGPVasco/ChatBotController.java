package com.chatgpvasco.chatGPVasco;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//Controlador REST para gerenciar as interações entre Cliente e ChatBot.
@RestController
@RequestMapping("/chatbot")
public class ChatBotController {

    private final ChatBot chatBot;
    //Construtor para inicializar o ChatBot
    public ChatBotController() {
        this.chatBot = new ChatBot(); 
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
