package shapes;
import util.Input;

public class CircleApp {
    public static void main(String[] args) {
        boolean resp;
        do {
            Input input = new Input();
            System.out.println("Enter a radius: ");
            double submitRadius = input.getDouble();
            Circle circle = new Circle(submitRadius);
            System.out.printf("For a circle with radius: %s.\nCircumference: %.2f.\nArea: %.2f.\n", submitRadius, circle.getCircumference(), circle.getArea());
            System.out.println("Would you like to create another circle?: [y/n]");
            resp = input.yesNo();
        }
        while (resp);
    }
}
