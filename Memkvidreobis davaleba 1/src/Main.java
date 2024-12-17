import Exercise3.Product;
import Exercise3.Shop;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product(5.5, "17/12/2024");
        Product product2 = new Product(8.9, "20/12/2024");
        Product product3 = new Product(6.9, "10/01/2025");
        Product product4 = new Product(2.3, "26/03/2025");
        Product product5 = new Product(4.0, "14/02/2025");

        Product[] P = {product1, product2, product3, product4, product5};
        Shop shop = new Shop(P);
    }
}