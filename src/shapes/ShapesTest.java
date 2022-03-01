package shapes;

public class ShapesTest {
    public static void main(String[] args) {
//        Rectangle neu = new Rectangle(12, 6);
//        System.out.println("neu.getArea() = " + neu.getArea());
//        System.out.println("neu.getPerimeter() = " + neu.getPerimeter());
//
//        Rectangle spaß = new Square(10);
//        System.out.println("spaß.getArea() = " + spaß.getArea());
//        System.out.println("spaß.getPerimeter() = " + spaß.getPerimeter());
//
//        Circle himmel = new Circle(14);
//        double hc = himmel.getCircumference();
//        double ha = himmel.getArea();
//        System.out.printf("himmel.getCircumference() = %.2f\n", hc);
//        System.out.printf("himmel.getArea() = %.2f\n", ha);

        // interfaces and abstracts,
        Measurable myShape;

        myShape = new Square(5);
        System.out.println("myShape.getPerimeter() = " + myShape.getPerimeter());
        System.out.println("myShape.getArea() = " + myShape.getArea());
        myShape = new Rectangle(7, 9);
        System.out.println("myShape.getPerimeter() = " + myShape.getPerimeter());
        System.out.println("myShape.getArea() = " + myShape.getArea());
    }

}