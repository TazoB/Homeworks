package Exercise3;

public class Shop {
    Product[] products = new Product[5];

    public Shop() {
        products = null;
    }

    public Shop(Product[] products) {
        this.products = products;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }
}
