package com.chatgpvasco.chatGPVasco;

//importação de File e classes da biblioteca do AliceBot
import java.io.File;
import org.alicebot.ab.Bot;
import org.alicebot.ab.Chat;

public class ChatBot {

    private final Bot bot;
    private final Chat chatSession;


    public ChatBot() {
        this.bot = new Bot("super", getResourcesPath());
        this.chatSession = new Chat(bot);
    }

    //Esse método recebe a mensagem do usuário e gera uma resposta do bot.
    public String generateResponse(String messageSent) {
        String response = "";

        if (!messageSent.isEmpty()) {
            response = chatSession.multisentenceRespond(messageSent);

            while (response.contains("&lt;"))
                response = response.replace("&lt;", "<");
            while (response.contains("&gt;"))
                response = response.replace("&gt;", ">");
        }
        
        return response;
    }

    // Método que retorna o caminho absoluto para a pasta resources, na qual estão os arquivos AIML do bot.
    private String getResourcesPath() {
        File currDir = new File(".");
        String path = currDir.getAbsolutePath();
        path = path.substring(0, path.length() - 2);
        System.out.println(path);
        return path + File.separator + "src" + File.separator + "main" + File.separator + "resources";
    }
}
