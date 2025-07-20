package day_1;
import java.util.Scanner;
public class ChatBot {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input;

        System.out.println("Welcome to SimpleBot!");
        System.out.println("Type 'bye' to exit.\n");

        while (true) {
            System.out.print("You: ");
            input = sc.nextLine().toLowerCase();

            if (input.equals("hi") || input.equals("hello")) {
                System.out.println("Bot: Hello! How can I help you?");
            } else if (input.contains("your name")) {
                System.out.println("Bot: I am StaticBot, your virtual assistant.");
            } else if (input.contains("how are you")) {
                System.out.println("Bot: I'm just a bunch of code, but I'm doing great!");
            } else if (input.contains("bye")) {
                System.out.println("Bot: Goodbye! Have a nice day.");
                break;
            } else if (input.contains("thank")) {
                System.out.println("Bot: You're welcome!");
            } else {
                System.out.println("Bot: Sorry, I don't understand that.");
            }
        }

        sc.close();
    }

}
