package Exercise2;

public class TestClass {
    public static void main(String[] args) {
        Shape shape = new Shape(3, 5);
        shape.displayData();
        System.out.println("Perimeter: " + shape.getPerimeter());
        System.out.println();

        Triangle triangle = new Triangle(6, 8, 9);
        triangle.displayData();
        System.out.println("Perimeter: " + triangle.getPerimeter());
        System.out.println();

        Rectangle rectangle = new Rectangle(8, 10);
        rectangle.displayData();
        System.out.println("Perimeter: " + rectangle.getPerimeter());
    }
}
