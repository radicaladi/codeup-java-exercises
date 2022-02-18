import java.util.Locale;
import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String userInput;
        String repeat;
        do {
            System.out.print("Ask Bob a anything: ");
            userInput = scanner.nextLine();

            if (userInput.endsWith("?")) {
                System.out.println("Sure.");
            } else if (userInput.endsWith("!")) {
                System.out.println("Whoa, chill out!");
            } else if (userInput.equals("") | userInput.equals(" ")) {
                System.out.println("Fine. Be that way!");
            } else System.out.println("Whatever.");
            System.out.println("Ask bob another question?: [y/N]");
            repeat = scanner.nextLine().toLowerCase(Locale.ROOT);
            if (repeat.equals("n")) {
                System.out.println("Okay, that's enough for today...");
            }
        } while (repeat.equals("y"));

    }
}
