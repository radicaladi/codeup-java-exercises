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
        int generatedNumber = (int) Math.floor(100 * Math.random() + 1);
        System.out.println(generatedNumber);
    }
}
