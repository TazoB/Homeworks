package Exercise1;

public class Triangle extends Polygon{
    public Triangle(int numberOfSides, double length) {
        super(numberOfSides, length);
    }

    @Override
    public double getPerimeter() {
        return 3 * super.getLength();
    }
}
