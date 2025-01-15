package exercise2;

import java.util.ArrayList;
import java.util.List;

public class TestClass {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Camry", "ABC-123");
        Car.Engine engine1 = car1.new Engine("ბენზინი", 4, 300000);

        Car car2 = new Car("BMW", "X5", "MNO-456");
        Car.Engine engine2 = car2.new Engine("ბენზინი", 8, 350000);

        Car car3 = new Car("Hyundai", "Elantra", "GHI-789");
        Car.Engine engine3 = car3.new Engine("გაზი", 4, 250000);

        List <Car> cars = new ArrayList<>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);

        int maxIndex = 0;
        int max = cars.get(0).getEngine().getMileageResource();

        for(int i = 1; i < cars.size(); i++) {
            if(cars.get(i).getEngine().getMileageResource() > max) {
                maxIndex = i;
                max = cars.get(i).getEngine().getMileageResource();
            }
        }

        cars.get(maxIndex).printInfo();
        cars.get(maxIndex).getEngine().printInfo();
    }
}
