import java.util.Objects;
import java.util.Scanner;
import java.util.Formatter;

public class ControlFlowExercises {
    public static void main(String[] args) {
//        int i = 5;
//        while (i <= 15) {
//            System.out.println("this is i at: " + i);
//            i++;
//        }
//        System.out.println("----------");

//        long j = 2;
//        do {
//            System.out.println("this is j at: " + j);
//            j+=2;
//        } while (j <= 100);
//        do {
//            System.out.println("this is j at: " + j);
//            j-=5;
//        } while (j >= -10);
//        do {
//            System.out.println("this is j at: " + j);
//            j*=j;
//        } while (j < 1000000); // notice: for this volume of number, you have to change type of the variable to correct parameters.

//        for (int j = 100; j >= -10; j-=5 ) {
//            System.out.println("j is at: " + j);
//        }
//        System.out.println("----------> break <--------");
//        for (long j = 2; j < 1000000; j*=j) {
//            System.out.println("j is at: " + j);
//        }

        // FIZZBUZZ
        /*One of the most common interview questions for entry-level programmers is the FizzBuzz test.
        Developed by Imran Ghory, the test is designed to assess basic looping and conditional logic skills.

        Write a program that prints the numbers from 1 to 100.
        For multiples of three: print “Fizz” instead of the number.
        For the multiples of five: print “Buzz”.
        For numbers which are multiples of both three and five: print “FizzBuzz”.

         */
//        int i = 0;
//        for (i = 0; i <= 100; i++){
//            if (i % 3 == 0 && i % 5 == 0) {
//                System.out.println("FizzBuzz");
//            }
//            else if (i % 3 == 0) {
//                System.out.println("Fizz");
//            }
//            else if (i % 5 == 0) {
//                System.out.println("Buzz");
//            }
//            System.out.println(i);
//        }

        // Display a table of powers
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an integer for your table of squares: ");
        int userInput = scanner.nextInt();
        System.out.printf("your number is: %s.%n", userInput);

        for (int i = 1; i <= userInput; i++) {
            Formatter format = new Formatter();
            format.format("%4d %4d %4d", i, i * i, i * i * i);
            System.out.println(format);
            }
        System.out.println("Would you like to continue?: [y/N]");
        String userChoice = null;
        userChoice = scanner.next();
        if (Objects.equals(userChoice, "y")) {
            System.out.println("Let's continue...");
        } else if (Objects.equals(userChoice, "N")) {
            System.out.println("Okay then... We'll stop here.");
        }

//        NOTES ON LOOPS
//        for(int i = 0; i <= 10; i++){
//            System.out.println("i is at: " + i);
//        }

//        int i = 0;
//        while (i < 10) {
//            System.out.println("i is: " + i);
//            i++;
//        }

//        int i = 0;
//        do {
//            System.out.println("i is at: " + i);
//            i++;
//        } while (i< 10);
    }
}
