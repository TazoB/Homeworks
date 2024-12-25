package Exercise1;

public class Polygon {
    private int numberOfSides;
    private double length;

    public Polygon(int numberOfSides, double length) {
        this.numberOfSides = numberOfSides;
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public int getNumberOfSides() {
        return numberOfSides;
    }

    public void setNumberOfSides(int numberOfSides) {
        this.numberOfSides = numberOfSides;
    }

    public double getPerimeter(){
        return numberOfSides * length;
    }
}
