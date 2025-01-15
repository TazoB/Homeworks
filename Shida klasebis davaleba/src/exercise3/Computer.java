package exercise3;

public class Computer {
    private String manufacturerCountry;
    private String brand;
    private double price;
    private boolean hasWarranty;

    public Computer(String manufacturerCountry, String brand, double price, boolean hasWarranty) {
        this.manufacturerCountry = manufacturerCountry;
        this.brand = brand;
        this.price = price;
        this.hasWarranty = hasWarranty;
    }

    public String getModel() {
        return brand;
    }

    public void setModel(String brand) {
        this.brand = brand;
    }

    public String getManufactureCountry() {
        return manufacturerCountry;
    }

    public void setManufactureCountry(String manufacturerCountry) {
        this.manufacturerCountry = manufacturerCountry;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isHasWarranty() {
        return hasWarranty;
    }

    public void setHasWarranty(boolean hasWarranty) {
        this.hasWarranty = hasWarranty;
    }

    public void prinInfo() {
        System.out.println("მწარმოებელი ქვეყანა: " + manufacturerCountry);
        System.out.println("ფირმა: " + brand);
        System.out.println("ფასი: " + price + " ლარი");
        System.out.println("საგარანტიო მომსახურეობა: " + (hasWarranty ? "დიახ" : "არა"));
    }

    public class Monitor {
        private double sizeInInches;
        private String resolution;
        private int refreshRate;

        public Monitor(double sizeInInches, String resolution, int refreshRate) {
            this.sizeInInches = sizeInInches;
            this.resolution = resolution;
            this.refreshRate = refreshRate;
        }

        public double getSizeInInches() {
            return sizeInInches;
        }

        public void setSizeInInches(double sizeInInches) {
            this.sizeInInches = sizeInInches;
        }

        public String getResolution() {
            return resolution;
        }

        public void setResolution(String resolution) {
            this.resolution = resolution;
        }

        public int getRefreshRate() {
            return refreshRate;
        }

        public void setRefreshRate(int refreshRate) {
            this.refreshRate = refreshRate;
        }

        public void printInfo() {
            System.out.println("მონიტორის დიაგონალი: " + sizeInInches + " დუიმი");
            System.out.println("რეზოლუცია: " + resolution);
            System.out.println("სიხშირე: " + refreshRate + " ჰერცი");
        }
    }

    public class Motherboard {
        private int ramSlots;
        private String ramType;
        private int fsbSpeed;

        public Motherboard(int ramSlots, String ramType, int fsbSpeed) {
            this.ramSlots = ramSlots;
            this.ramType = ramType;
            this.fsbSpeed = fsbSpeed;
        }

        public int getRamSlots() {
            return ramSlots;
        }

        public void setRamSlots(int ramSlots) {
            this.ramSlots = ramSlots;
        }

        public String getRamType() {
            return ramType;
        }

        public void setRamType(String ramType) {
            this.ramType = ramType;
        }

        public int getFsbSpeed() {
            return fsbSpeed;
        }

        public void setFsbSpeed(int fsbSpeed) {
            this.fsbSpeed = fsbSpeed;
        }

        public void printInfo() {
            System.out.println("RAM სლოტების რაოდენობა: " + ramSlots);
            System.out.println("RAM ტიპი: " + ramType);
            System.out.println("სიხშირე: " + fsbSpeed + " MHz");
        }
    }
}
