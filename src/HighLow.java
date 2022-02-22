import java.util.Scanner;

public class HighLow {
    public static void main(String[] args) {
        numberGenerator();
    }
    // Build a high-low guessing game.
    // Create a class named HighLow inside of src.
    //
    //The specs for the game are:
    //
    //Game picks a random number between 1 and 100.
    //Prompts user to guess the number.
    //All user inputs are validated.
    //If user's guess is less than the number, it outputs "HIGHER".
    //If user's guess is more than the number, it outputs "LOWER".
    //If a user guesses the number, the game should declare "GOOD GUESS!"

    public static void numberGenerator () {
        int numberToGuess = (int) Math.floor(100 * Math.random() + 1);
        System.out.println(numberToGuess); // confirm working at this point
        Scanner castNet = new Scanner(System.in);
        System.out.println("Guess a number 1-100: ");
        int userGuess = castNet.nextInt();
        System.out.println("Your guess is, " + userGuess); // confirm working at this point
        if (userGuess == numberToGuess) {
            System.out.println("Woah! You guessed the right number! Awesome!");
        }
        else if ( userGuess < numberToGuess) {
            System.out.println("HIGHER");
        }
        else if ( userGuess > numberToGuess ) {
            System.out.println("LOWER");
        }
    }


}
