package productcatalog;

import java.util.HashSet;

public class ProductCatalog {
    private HashSet<String> products;

    public ProductCatalog() {
        products = new HashSet<>();
    }

    public boolean addProduct(String productName) {
        return products.add(productName);
    }

    public boolean removeProduct(String productName) {
        return products.remove(productName);
    }

    public boolean searchProduct(String productName) {
        return products.contains(productName);
    }

    public void displayProducts() {
        for (String product : products) {
            System.out.println(product);
        }
    }
}
