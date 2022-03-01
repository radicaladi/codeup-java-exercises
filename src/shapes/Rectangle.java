package shapes;

public class Rectangle extends Quadrilateral implements Measurable {
    public Rectangle(double length, double width) {
        super(length, width);
    }

    @Override
    public double getPerimeter() {
        return 2 * (length + width);
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public void setLength(double number) {
        this.length = number;
    }

    @Override
    public void setWidth(double number) {
        this.width = number;
    }





    /*
    protected double length;
    protected double width;

    public Rectangle (double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getPerimeter() {
        return this.length * 2 + this.width * 2;
    }

    public double getArea() {
        return this.length * this.width;
    }
     */
}