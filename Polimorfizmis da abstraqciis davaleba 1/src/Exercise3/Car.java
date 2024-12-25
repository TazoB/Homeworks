package Exercise3;

public class Car extends Toy{
    private double priceOfInterior;
    private double priceOfWheel;
    private int numberOfWheels;
    private double otherExpenses;

    public Car(double priceOfInterior, double priceOfWheel, int numberOfWheels, double otherExpenses) {
        this.priceOfInterior = priceOfInterior;
        this.priceOfWheel = priceOfWheel;
        this.numberOfWheels = numberOfWheels;
        this.otherExpenses = otherExpenses;
    }

    public double getPriceOfInterior() {
        return priceOfInterior;
    }

    public void setPriceOfInterior(double priceOfInterior) {
        this.priceOfInterior = priceOfInterior;
    }

    public double getPriceOfWheel() {
        return priceOfWheel;
    }

    public void setPriceOfWheel(double priceOfWheel) {
        this.priceOfWheel = priceOfWheel;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public double getOtherExpenses() {
        return otherExpenses;
    }

    public void setOtherExpenses(double otherExpenses) {
        this.otherExpenses = otherExpenses;
    }

    @Override
    public double getPrice() {
        return priceOfInterior + numberOfWheels * priceOfWheel + otherExpenses;
    }
}
