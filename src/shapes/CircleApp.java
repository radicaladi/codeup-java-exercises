package shapes;
import util.Input;

public class CircleApp {
    private static int circleCntr = 1;

    public static int updateCount() {
     return circleCntr++;
    }

    public static void main(String[] args) {
        boolean resp;
        int totalCircles;
        do {
            Input input = new Input();
            System.out.println("Enter a radius: ");
            double submitRadius = input.getDouble();
            Circle circle = new Circle(submitRadius);
            System.out.printf("For a circle with radius: %s.%nCircumference: %.2f.%nArea: %.2f.%n", submitRadius, circle.getCircumference(), circle.getArea());
            System.out.println("Would you like to create another circle?: [y/n]");
            resp = input.yesNo();
            totalCircles = updateCount();
        }
        while (resp);
        System.out.printf("You've create a total of %s circles.%n", totalCircles);
    }
}
