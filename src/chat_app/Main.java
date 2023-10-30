5package chat_app;

import java.util.List;
import java.util.Scanner;

	public class Main {
	    public static void main(String[] args) {
	        PrivateChat privateChat = new PrivateChat();
	        PublicChat publicChat = new PublicChat();
	        FriendsList friendsList = new FriendsList();

	        Scanner scanner = new Scanner(System.in);
	        int choice;

	        do {
	            System.out.println("Chat Application Menu:");
	            System.out.println("1. View Private Chat");
	            System.out.println("2. Write to Private Chat");
	            System.out.println("3. View Public Chat");
	            System.out.println("4. Write to Public Chat");
	            System.out.println("5. View Friends List");
	            System.out.println("6. Add a Friend");
	            System.out.println("7. Save and Exit");
	            System.out.print("Enter your choice: ");
	            
	            choice = scanner.nextInt();
	            scanner.nextLine();  // Consume the newline

	            switch (choice) {
	                case 1:
	                    List<String> privateMessages = privateChat.getPrivateChatMessages();
	                    System.out.println("Private Chat Messages:");
	                    for (String message : privateMessages) {
	                        System.out.println(message);
	                    }
	                    break;
	                case 2:
	                    System.out.print("Enter your private message: ");
	                    String privateMessage = scanner.nextLine();
	                    privateChat.addPrivateChatMessage(privateMessage);
	                    break;
	                case 3:
	                    List<String> publicMessages = publicChat.getPublicChatMessages();
	                    System.out.println("Public Chat Messages:");
	                    for (String message : publicMessages) {
	                        System.out.println(message);
	                    }
	                    break;
	                case 4:
	                    System.out.print("Enter your public message: ");
	                    String publicMessage = scanner.nextLine();
	                    publicChat.addPublicChatMessage(publicMessage);
	                    break;
	                case 5:
	                    List<String> friends = friendsList.getFriendsList();
	                    System.out.println("Friends List:");
	                    for (String friend : friends) {
	                        System.out.println(friend);
	                    }
	                    break;
	                case 6:
	                    System.out.print("Enter a friend's name to add: ");
	                    String newFriend = scanner.nextLine();
	                    friendsList.addFriend(newFriend);
	                    break;
	                case 7:
	                    privateChat.savePrivateChat();
	                    publicChat.savePublicChat();
	                    friendsList.saveFriendsList();
	                    System.out.println("Chat data saved. Exiting...");
	                    break;
	                default:
	                    System.out.println("Invalid choice. Please try again.");
	            }
	        } while (choice != 7);
	    }
	}

