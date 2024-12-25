package Exercise2;

public class Shape {
    private double x;
    private double y;

    public Shape(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void displayData() {
        System.out.println("X: " + x);
        System.out.println("Y: " + y);
    }

    public double getPerimeter() {
        return 2 * (getX() + getY());
    }
}
