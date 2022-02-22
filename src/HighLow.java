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
        Scanner castNet = new Scanner(System.in);
        int userGuess;
        int guessCntr = 0;
        do {
            System.out.println("Guess a number 1-100: ");
            userGuess = castNet.nextInt();

            if ( userGuess == numberToGuess ) {
                System.out.println("Woah! You guessed the right number! GOOD GUESS!");
                break;
            }
            else if ( userGuess < numberToGuess ) {
                System.out.println("hint: HIGHER");
                guessCntr++;
                System.out.println("guess tally of 10: " + guessCntr);
            }
            else if ( userGuess > numberToGuess ) {
                System.out.println("hint: LOWER");
                guessCntr++;
                System.out.println("guess tally of 10: " + guessCntr);
            }
        }
        while ( userGuess != numberToGuess & guessCntr < 10);

        if ( guessCntr == 10 ) {
            System.out.println("Oof! You've reached maximum tries. Tough luck...\nThe number to guess was " + numberToGuess + ".\nTry again next time...");
        }
    }


}
