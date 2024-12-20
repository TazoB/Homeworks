public class Scientific extends Book{
    private String science;

    public Scientific(String title, int numberOfPages, String author, boolean isHardcover, String science) {
        super(title, numberOfPages, author, isHardcover);
        this.science = science;
    }
}
