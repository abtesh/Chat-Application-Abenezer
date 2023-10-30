package chat_app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class PrivateChat {
    private List<String> privateChatMessages = new ArrayList<>();

    public PrivateChat() {
        loadPrivateChat();
    }

    public void loadPrivateChat() {
        try (BufferedReader reader = new BufferedReader(new FileReader("Donut[AFK].log"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                privateChatMessages.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void savePrivateChat() {
        try (PrintWriter writer = new PrintWriter(new FileWriter("Donut[AFK].log"))) {
            for (String message : privateChatMessages) {
                writer.println(message);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<String> getPrivateChatMessages() {
        return privateChatMessages;
    }

    public void addPrivateChatMessage(String message) {
        privateChatMessages.add(message);
    }
}