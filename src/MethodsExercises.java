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
        factorials();
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
    public static int addition(){
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
        if (nummer <= 10 & nummer >=1){
            long factorial = 1;
            for(int i = 1; i <= nummer; i++){
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

    public static void dice () {
        Scanner value = new Scanner(System.in);
        System.out.println("Enter number of sides for pair of dice: ");
        int sidesOnDice = value.nextInt();
        System.out.println("Roll dice: [y/N]");
        String rollEm = value.nextLine();
        if (rollEm.equals("y")){

        }
    }

}
