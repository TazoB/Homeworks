public class Car {
    String mark;
    String model;
    int publishYear;
    String plateNumber;

    Car() {
        mark = "null";
        model = "null";
        publishYear = 0;
        plateNumber = "null";
    }

    Car(String mark, String model, int publishYear, String plateNumber) {
        this.mark = mark;
        this.model = model;
        this.publishYear = publishYear;
        this.plateNumber = plateNumber;
    }

    void printInfo() {
        System.out.println("Car Mark: " + mark);
        System.out.println("Car Model: " + model);
        System.out.println("Car Publish Year: " + publishYear);
        System.out.println("Car Plate Number: " + plateNumber);
        System.out.println();
    }
}
