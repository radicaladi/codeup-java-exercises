import java.util.Scanner;

public class ConsoleExercises {
    public static void main (String[] args) {
        double pi = 3.14159;
        System.out.printf("The value of pi is approximately, %s. %n", pi);

        Scanner scanner = new Scanner(System.in);

        // ex 1b:
        //Prompt a user to enter an integer and store that value in an int variable using the nextInt method.
//        System.out.print("Enter an integer: ");
//        int userInt = scanner.nextInt();
//
//        System.out.println("You entered: --> \"" + userInt + "\" <--");
        // What happens if you input something that is not an integer?
        // ans: throws multiple Scanner errors. Likely because int cannot hold a value that isn't a number

        // ex 2b:
        // Prompt a user to enter 3 words, and store each of them in a separate variable.
        // Then, display them back in the console, each on a newline.
//        System.out.print("Enter three words: ");
//        String userInput1 = scanner.next();
//        String userInput2 = scanner.next();
//        String userInput3 = scanner.next();
//
//        System.out.println(userInput1);
//        System.out.println(userInput2);
//        System.out.println(userInput3);
        // What happens if you enter less than 3 words?
        // ans: the console won't proceed until you enter the third word
        // What happens if you enter more than 3 words?
        // ans: the program won't print extra words as they aren't stored in variables and written to print.

        // ex 3b:
        // Prompt a user to enter a sentence,
        // then store that sentence in a String variable using the next method.
        // Then, display that sentence back to the user.
//        System.out.println("Enter a sentence: ");
//        String userSentence = scanner.next();
//
//        System.out.println(userSentence);
        // Do you capture all the words?
        // ans: No. The String variable using scanner.next() won't capture any word after the whitespace of the first word.

        // Rewrite the above example using the nextLine method.
        System.out.println("Type a sentence: ");
        String userSentence = scanner.nextLine();

        System.out.println(userSentence);
    }
}
