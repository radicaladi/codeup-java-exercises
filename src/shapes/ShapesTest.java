package shapes;

public class ShapesTest {

    public static void main(String[] args) {
        Rectangle neu = new Rectangle(12, 6);
        System.out.println("neu.getArea() = " + neu.getArea());
        System.out.println("neu.getPerimeter() = " + neu.getPerimeter());

        Rectangle spaß = new Square(10);
        System.out.println("spaß.getArea() = " + spaß.getArea());
        System.out.println("spaß.getPerimeter() = " + spaß.getPerimeter());

    }

}