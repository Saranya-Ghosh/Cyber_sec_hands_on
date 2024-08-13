package bookcollection;

public class BookCollectionTest {
    public static void main(String[] args) {
        BookCollection collection = new BookCollection();

        // Add books
        collection.addBook("The Great Gatsby");
        collection.addBook("To Kill a Mockingbird");
        collection.addBook("1984");

        // Display books
        System.out.println("Books in collection:");
        collection.displayBooks();

        // Remove a book
        collection.removeBook("1984");
        System.out.println("\nBooks in collection after removing '1984':");
        collection.displayBooks();
    }
}
