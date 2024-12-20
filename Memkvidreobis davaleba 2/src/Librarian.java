public class Librarian extends LibraryEmployee {
    private String workingHours;

    public Librarian(String firstName, String secondName, String ID, String workingHours) {
        super(firstName, secondName, ID);
        this.workingHours = workingHours;
    }
}
