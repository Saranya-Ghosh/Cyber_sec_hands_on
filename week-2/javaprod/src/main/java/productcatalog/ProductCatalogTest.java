package productcatalog;

public class ProductCatalogTest {
    public static void main(String[] args) {
        ProductCatalog catalog = new ProductCatalog();

        // Add products
        catalog.addProduct("Laptop");
        catalog.addProduct("Smartphone");
        catalog.addProduct("Tablet");

        // Display products
        System.out.println("Products in catalog:");
        catalog.displayProducts();

        // Search for products
        System.out.println("\nSearching for 'Smartphone': " + catalog.searchProduct("Smartphone"));
        System.out.println("Searching for 'Camera': " + catalog.searchProduct("Camera"));

        // Remove a product
        catalog.removeProduct("Tablet");
        System.out.println("\nProducts in catalog after removing 'Tablet':");
        catalog.displayProducts();
    }
}
