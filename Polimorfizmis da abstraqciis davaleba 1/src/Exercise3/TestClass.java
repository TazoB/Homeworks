package Exercise3;

public class TestClass {
    public static void main(String[] args) {
        Car car  = new Car(2, 3, 4, 1);
        System.out.println("Total Price - " + car.getPrice());
        System.out.println();

        Dolly dolly = new Dolly(5, 3, 2);
        System.out.println("Total Price - " + dolly.getPrice());
    }
}
