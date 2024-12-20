import java.util.Random;

public class BookAdvisor extends LibraryEmployee {
    private double suggestRating;
    Library libraryName;

    public BookAdvisor(String firstName, String secondName, String ID, double suggestRating, Library liblaryName) {
        super(firstName, secondName, ID);
        this.suggestRating = suggestRating;
        this.libraryName = liblaryName;
    }

    public String suggestMeBook() {
        Random random = new Random();
        int index = random.nextInt(libraryName.getBooks().length);

        return libraryName.getBooks()[index].getTitle();
    }
}
