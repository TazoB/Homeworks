package Exercise3;

public class Product{
    private double price;
    private String term;

    public Product() {
        price = 0.0;
        term = null;
    }

    public Product(double price, String term) {
        this.price = price;
        this.term = term;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term;
    }
}
