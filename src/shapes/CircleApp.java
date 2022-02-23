package shapes;
import util.Input;

public class CircleApp {
    public static void main(String[] args) {
        Input input = new Input();
        System.out.println("Enter a radius: ");
        double submitRadius = input.getDouble();
        Circle circle = new Circle(submitRadius);
        System.out.printf("For a circle with radius: %.2f.\nCircumference is: %.2f.\nArea is: %.2f.", submitRadius, circle.getCircumference(), circle.getArea());
    }
}
