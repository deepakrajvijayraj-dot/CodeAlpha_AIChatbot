import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;
public class AIChatbot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("===================================");
        System.out.println("      Welcome to AI Chatbot");
        System.out.println("===================================");
        System.out.println("Type 'exit' to close the chatbot.\n");
        while (true) {
            System.out.print("You : ");
            String input = sc.nextLine().toLowerCase();
            switch (input) {
                case "hi":
                case "hello":
                    System.out.println("Bot : Hello! Welcome.");
                    break;
                case "how are you":
                    System.out.println("Bot : I'm doing great. Thanks for asking!");
                    break;
                case "what is your name":
                    System.out.println("Bot : My name is CodeAlpha AI Chatbot.");
                    break;
                case "date":
                    System.out.println("Bot : Today's Date is " + LocalDate.now());
                    break;
                case "time":
                    System.out.println("Bot : Current Time is " + LocalTime.now().withNano(0));
                    break;
                case "thank you":
                    System.out.println("Bot : You're welcome!");
                    break;
                case "bye":
                case "exit":
                    System.out.println("Bot : Goodbye! Have a nice day.");
                    sc.close();
                    return;
                default:
                    System.out.println("Bot : Sorry! I don't understand your question.");
            }
        }
    }
}