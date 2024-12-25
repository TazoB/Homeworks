package Exercise2;

public class Rectangle extends Shape{
    public Rectangle(double x, double y) {
        super(x, y);
    }

    @Override
    public void displayData() {
        System.out.println("Name: Rectangle.");
        super.displayData();
    }
}
