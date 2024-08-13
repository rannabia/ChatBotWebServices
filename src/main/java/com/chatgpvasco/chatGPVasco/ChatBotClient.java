package com.chatgpvasco.chatGPVasco;

//Importa a classe RestTemplate do Spring Framework
import org.springframework.web.client.RestTemplate;
import java.util.Scanner;

// Classe principal que representa o cliente da aplicação.
public class ChatBotClient {
    //Endpoint do servidor onde o chatbot está disponível.
    private static final String URL = "http://localhost:8080/chatbot/message";

    public static void main(String[] args) {
        RestTemplate restTemplate = new RestTemplate(); // Cria uma instância para enviar requisições HTTP.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your message or 'exit' to end the chat: " );
        while(true){
            String message = scanner.nextLine();

            if(message.equalsIgnoreCase("exit")){
                System.out.println("Closing ChatBot");
                break;
            }
        String response = restTemplate.postForObject(URL, message, String.class);
        System.out.println("ChatBot's answer: " + response);
        }
        scanner.close();
    }
}
