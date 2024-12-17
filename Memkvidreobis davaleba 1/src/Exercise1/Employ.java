package Exercise1;

public class Employ extends Human{
    private String ID;

    Employ() {
        super();
        ID = null;
    }

    Employ(String name, String surname, int age, String ID) {
        super(name, surname, age);
        this.ID = ID;
    }
}
