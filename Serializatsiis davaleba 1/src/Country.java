import java.io.Serializable;

public class Country implements Serializable {
    private String name;
    private int population;
    private int area;

    public Country(String name, int population, int area) {
        this.name = name;
        this.population = population;
        this.area = area;
    }

    public Country() {
        name = null;
        population = 0;
        area = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", population=" + population +
                ", area=" + area +
                '}';
    }
}
