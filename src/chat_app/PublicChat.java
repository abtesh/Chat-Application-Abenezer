package chat_app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class PublicChat{
    private List<String> publicChatMessages = new ArrayList<>();

    public PublicChat() {
        loadPublicChat();
    }

    public void loadPublicChat() {
        try (BufferedReader reader = new BufferedReader(new FileReader("Eukarte.log"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                publicChatMessages.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void savePublicChat() {
        try (PrintWriter writer = new PrintWriter(new FileWriter("Eukarte.log"))) {
            for (String message : publicChatMessages) {
                writer.println(message);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<String> getPublicChatMessages() {
        return publicChatMessages;
    }

    public void addPublicChatMessage(String message) {
        publicChatMessages.add(message);
    }
}
