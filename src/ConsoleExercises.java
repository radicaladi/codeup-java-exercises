import java.util.Scanner;

public class ConsoleExercises {
    public static void main (String[] args) {
        double pi = 3.14159;
        System.out.printf("The value of pi is approximately, %s. %n", pi);

        Scanner scanner = new Scanner(System.in);

        // ex 1b:
        //Prompt a user to enter an integer and store that value in an int variable using the nextInt method.
        System.out.print("Enter an integer: ");
        int userInt = scanner.nextInt();

        System.out.println("You entered: --> \"" + userInt + "\" <--");
        // What happens if you input something that is not an integer?
        // ans: throws multiple Scanner errors. Likely because int cannot hold a value that isn't a number
    }
}
