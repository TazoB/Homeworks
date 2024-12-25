package Exercise2;

public class Triangle extends Shape{
    private double z;

    public Triangle(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    @Override
    public void displayData() {
        System.out.println("Name: Triangle");
        super.displayData();
        System.out.println("Z: " + z);
    }

    @Override
    public double getPerimeter() {
        return getX() + getY() + z;
    }
}
