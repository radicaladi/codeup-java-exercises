package util;
import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input (){
        Scanner scanner = new Scanner(System.in);
    }

    public String getString() {
        return scanner.next();
    }
    public boolean yesNo (){
        String input = scanner.next();
        return input.equalsIgnoreCase("yes") || input.equalsIgnoreCase("y");
    }
    public int getInt (int min, int max){
        int input;
        do {
            System.out.printf("Enter a number between %s and %s: ", min, max);
            input = scanner.nextInt();
        }
        while ( input < min || input > max);
        return input;
    }
    public int getInt (){
        return scanner.nextInt();
    }
    public double getDouble (double min, double max) {

    }
    public double getDouble (){

    }

}
