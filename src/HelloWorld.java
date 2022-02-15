// class - defines the class
// HelloWorld is the name of the class and matches the .java file name

public class HelloWorld {

    // method - similar to js function
    // main method -> specific method in java that acts as our entry point when running java
    // similar to the starting point of a game.

    public static void main (String[] args){
        // public – [...]
        // static – [...]
        // void – means the method is not expected to return anything
        // main – name of our method; keyword that is going to be searched as the entry point
        // String[] args – is passing in a string array that is named args

        // ex 1a:
        // print out "Hello, World!" to the console
        // System.out.println("Hello, World!");
        // ex 1b:
        // print the above w/o println
        System.out.print("Hello, ");
        System.out.print("World!");

        // syntax ex 2:
        // create int type variable named myFavoriteNumber; assign favorite number and print
        int myFavoriteNumber = 12;
        System.out.println(myFavoriteNumber);

        // ex 2:
        // create string type variable named myString; assign a string value and print
        String myString = "Twelve is my favorite number.";
        System.out.println(myString);

        // ex 3:
        // change your code to assign a character value to myString. What do you notice?
        char myString = 'l';
        // notice: cannot assign another value to a variable already defined.

        // ex 4:
        // change your code to assign the value '3.1459' to myString. What happens?
        double myString = 3.1459;
        /* notice: still cannot assign another value to a variable already defined.
         * Numbers (decimals?) also appear differently. "double" is intelliJ's suggested type for this sort of decimal.
         */
    }
}

