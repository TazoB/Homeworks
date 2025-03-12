package savarjisho3;

import java.util.Comparator;

public class CompareWithEngineCapacity implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        return Double.compare(o1.getEngine().getCapacity(), o2.getEngine().getCapacity());
    }
}
