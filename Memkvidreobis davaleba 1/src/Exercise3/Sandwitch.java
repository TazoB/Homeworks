package Exercise3;

public class Sandwitch extends Product{
    private double length;

    public Sandwitch() {
        super();
        length = 0.0;
    }

    public Sandwitch(double price, String term, double length) {
        super(price, term);
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
}
