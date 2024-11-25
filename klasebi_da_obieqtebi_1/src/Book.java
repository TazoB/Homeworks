public class Book {
        String title;
        String author;
        int pages;

        public Book(){
            title = "null";
            author = "null";
            pages = 0;
        }

        public Book(String title, String author, int pages){
            this.title = title;
            this.author = author;
            this.pages = pages;
        }

        public Book(String title, String author){
            this.title = title;
            this.author = author;
            pages = 0;
        }
    public void

displayBookInfo(){
            System.out.println("Title - " + title);
            System.out.println("Author - " + author);
            System.out.println("Number of pages - " + pages);
        }
}
