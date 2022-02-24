package shapes;

public class Rectangle {
    protected double length;
    protected double width;

    public double rectangle (double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getPerimeter() {
        return length * 2 + width * 2;
    }

    public double getArea() {
        return length * width;
    }
}
