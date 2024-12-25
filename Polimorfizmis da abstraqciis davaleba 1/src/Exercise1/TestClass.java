package Exercise1;

public class TestClass {
    public static void main(String[] args) {
        Polygon polygon = new Polygon(6, 5.5);
        System.out.println(polygon.getPerimeter());

        Square square = new Square(4, 2.3);
        System.out.println(square.getPerimeter());

        Triangle triangle = new Triangle(3, 9);
        System.out.println(triangle.getPerimeter());
    }
}
