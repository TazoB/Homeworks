import java.util.Objects;

public class Writer {
    private String firstName;
    private String lastName;

    public Writer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Writer writer = (Writer) o;
        if(this.hashCode() != o.hashCode()) return false;
        return Objects.equals(firstName, writer.firstName) && Objects.equals(lastName, writer.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }

    @Override
    public String toString() {
        return "Writer {\n" +
                "\t\t\tFirst Name: " + firstName + ",\n" +
                "\t\t\tLast Name: " + lastName + ",\n" +
                '}';
    }
}
