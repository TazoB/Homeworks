package Exercise3;

public class Cake extends Product{
    private double weight;

    public Cake() {
        super();
        weight = 0.0;
    }

    public Cake(double price, String term, double weight) {
        super(price, term);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
