package Exercise3;

public class Milk extends Product{
    private double volume;

    public Milk() {
        super();
        volume = 0.0;
    }

    public Milk(double price, String term, double volume) {
        super(price, term);
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }
}
