package Exercise2;

public class Rectangle extends Shape{
    private double length;
    private double width;

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public double getPerimeter() {
        return 2 * (length + width);
    }

    public double getDiagonal() {
        return Math.sqrt(length * length + width * width);
    }
}
