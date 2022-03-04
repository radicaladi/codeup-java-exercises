package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input() {
        this.scanner = new Scanner(System.in);
    }

    public String getString() {
        return scanner.nextLine();
    }

    public boolean yesNo() {
        String input = scanner.next();
        return input.equalsIgnoreCase("yes") || input.equalsIgnoreCase("y");
    }

    public int getInt(int min, int max) {
        int input;
        do {
            System.out.printf("Enter a number between %s and %s: ", min, max);
            input = scanner.nextInt();
        }
        while (input < min || input > max);
        return input;
    }

    public int getInt() {
        return scanner.nextInt();
    }

    public double getDouble(double min, double max) {
        double input;
        do {
            System.out.printf("Enter a decimal number between %s and %s: ", min, max);
            input = scanner.nextDouble();
        }
        while (input < min || input > max);
        return input;
    }

    public double getDouble() {
        return scanner.nextDouble();
    }

}
