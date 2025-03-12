package savarjisho3;

public class Engine {
    private String fuelType;
    private int cylinderCount;
    private double capacity;

    public Engine(String fuelType, int cylinderCount, double capacity) {
        this.fuelType = fuelType;
        this.cylinderCount = cylinderCount;
        this.capacity = capacity;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public int getCylinderCount() {
        return cylinderCount;
    }

    public void setCylinderCount(int cylinderCount) {
        this.cylinderCount = cylinderCount;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "fuelType='" + fuelType + '\'' +
                ", cylinderCount=" + cylinderCount +
                ", capacity=" + capacity +
                '}';
    }
}
