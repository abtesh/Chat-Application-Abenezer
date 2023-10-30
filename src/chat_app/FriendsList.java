package chat_app;

import java.io.*;
import java.util.*;


public class FriendsList {
    private List<String> friends = new ArrayList<>();

    public FriendsList() {
        loadFriendsList();
    }

    public void loadFriendsList() {
        try (BufferedReader reader = new BufferedReader(new FileReader("friends.list"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                friends.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void saveFriendsList() {
        try (PrintWriter writer = new PrintWriter(new FileWriter("friends.list"))) {
            for (String friend : friends) {
                writer.println(friend);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<String> getFriendsList() {
        return friends;
    }

    public void addFriend(String friend) {
        friends.add(friend);
    }
}

