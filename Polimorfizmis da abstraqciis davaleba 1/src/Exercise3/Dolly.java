package Exercise3;

public class Dolly extends Toy{
    private double priceOfHair;
    private double priceOfClothes;
    private double otherExpenses;

    public Dolly(double priceOfHair, double priceOfClothes, double otherExpenses) {
        this.priceOfHair = priceOfHair;
        this.priceOfClothes = priceOfClothes;
        this.otherExpenses = otherExpenses;
    }

    public double getPriceOfHair() {
        return priceOfHair;
    }

    public void setPriceOfHair(double priceOfHair) {
        this.priceOfHair = priceOfHair;
    }

    public double getPriceOfClothes() {
        return priceOfClothes;
    }

    public void setPriceOfClothes(double priceOfClothes) {
        this.priceOfClothes = priceOfClothes;
    }

    public double getOtherExpenses() {
        return otherExpenses;
    }

    public void setOtherExpenses(double otherExpenses) {
        this.otherExpenses = otherExpenses;
    }

    @Override
    public double getPrice() {
        return priceOfHair + priceOfClothes + otherExpenses;
    }
}
