package com.chatgpvasco.chatGPVasco;

//importam classes do framework Spring Boot
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//Anotação Spring
@SpringBootApplication

//classe principal da aplicação Spring Boot
public class ChatBotApplication {

    public static void main(String[] args) {
        SpringApplication.run(ChatBotApplication.class, args); // Inicia a aplicação, configurando todo o ambiente, incluindo o servidor web incorporado.
    }
}
