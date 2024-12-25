package Exercise1;

public class Square extends Polygon{
    public Square(int numberOfSides, double length) {
        super(numberOfSides, length);
    }

    @Override
    public double getPerimeter() {
        return 4 * super.getLength();
    }
}
