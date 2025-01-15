package exercise2;

public class Car {
    private String ManufacturingCompany;
    private String model;
    private String plate;

    public Car(String manufacturingCompany, String model, String plate) {
        ManufacturingCompany = manufacturingCompany;
        this.model = model;
        this.plate = plate;
    }

    public String getManufacturingCompany() {
        return ManufacturingCompany;
    }

    public void setManufacturingCompany(String manufacturingCompany) {
        ManufacturingCompany = manufacturingCompany;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public void printInfo() {
        System.out.println("Manufacturing Company: " + ManufacturingCompany);
        System.out.println("Model: " + model);
        System.out.println("Plate: " + plate);
    }

    public class Engine {
        private String fuelType;
        private int cylinderCount;
        private int mileageResource;

        public Engine(String fuelType, int cylinderCount, int mileageResource) {
            this.fuelType = fuelType;
            this.cylinderCount = cylinderCount;
            this.mileageResource = mileageResource;
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

        public int getMileageResource() {
            return mileageResource;
        }

        public void setMileageResource(int mileageResource) {
            this.mileageResource = mileageResource;
        }

        public void printInfo() {
            System.out.println("Fuel Type: " + fuelType);
            System.out.println("Cylinder Count: " + cylinderCount);
            System.out.println("Mileage Resource: " + mileageResource);
        }
    }

    private Engine engine;

    public Engine getEngine() {
        return engine;
    }
}
