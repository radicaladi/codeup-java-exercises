import java.util.Locale;
import java.util.Scanner;


public class MethodsExercises {
    public static void main(String[] args) {
//        System.out.println(userName());
//        System.out.println(newAddition());
//        System.out.println(addition(5, 3));
//        System.out.println(addition(5, 9));
//        System.out.println(subtraction(5, 3));
//        System.out.println(multiplication(5, 3));
//        System.out.println(division(5, 3));
//        System.out.println(modulus(5, 3));

//        validator();
//        factorials();
        chooseDice();
    }

    // class mini ex:
//    public static String userName(){
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("What is your first name?: ");
//        String user = scanner.next();
//        return "Hello, " + user;
//    }

    // Basic Arithmetic

    public static int addition(int number1, int number2) {
        int solution = number1 + number2;
        return solution;
    }

    // creating method overload with addition method
    public static int addition() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        return num1 + num2;
    }

    public static int subtraction(int number1, int number2) {
        return number1 - number2;
    }

    public static int multiplication(int number1, int number2) {
        return number1 * number2;
    }

    public static int division(int number1, int number2) {
        return number1 / number2;
    }

    public static int modulus(int number1, int number2) {
        return number1 % number2;
    }

    // exercise 2:
    // Create a method that validates that user input is in a certain range
    public static void validator() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int uno = scanner.nextInt();
        int dos = scanner.nextInt();
        if (uno >= 1 & uno <= 10 && dos <= 10 & dos >= 1) {
            System.out.println("Entries are within parameters!");
            return;
        }
        System.out.println("Invalid!");
        validator();
    }

    // exercise 3:
    // Calculate the factorial of a number
    public static void factorials() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number from 1-10: ");
        int nummer = scanner.nextInt();
        // arithmetic starts
        if (nummer <= 10 & nummer >= 1) {
            long factorial = 1;
            for (int i = 1; i <= nummer; i++) {
                factorial = factorial * i;
            }
            System.out.println(nummer + "!" + " = " + factorial);
            recursion();
        }
    }

    public static void recursion() {
        Scanner scrape = new Scanner(System.in);
        System.out.println("Would you like to continue?: [y/N]");
        String antwort = scrape.next().toLowerCase(Locale.ROOT);
        if (antwort.equals("y")) {
            factorials();
        } else if (antwort.equals("n")) {
            System.out.println("okay, that's enough for now...");
        }
    }

    // exercise 4:
    // Create an application that simulates dice rolling
    /*
        Ask the user to enter the number of sides for a pair of dice. ✅
        Prompt the user to roll the dice. ✅
        "Roll" two n-sided dice, display the results of each, and then ask the user if he/she wants to roll the dice again.
        Use static methods to implement the method(s) that generate the random numbers.
        Use the .random method of the java.lang.Math class to generate random numbers.
    */

        public static void chooseDice() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Choose number of sides on dice: ");
            int n = scanner.nextInt();

            Scanner scanned = new Scanner(System.in);
            System.out.println("Throw dice?: [y/N]");
            String response = scanned.nextLine();

            if (response.equals("y")){
                int index = 0;
                do {
                index = (int) Math.floor((n * Math.random() + 1) * 2);
                System.out.println(index);
                }
                while (index != n); // stops rolling dice when index = sides chosen
                // note: if playing craps then index != 2, 3, or 12 would mean you lose
                // note 2: if playing craps then a 7 or 11 means you win

            } else if (response.equals("n")) {
                System.out.println("This table is for high stakes only...");
            }
        }
        // note 3: how would you limit rolls to 2 attempts only?



    } // <---------- end of class
