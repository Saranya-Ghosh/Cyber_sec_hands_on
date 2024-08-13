package userregistration;

public class UserRegistrationTest {
    public static void main(String[] args) {
        UserRegistration registration = new UserRegistration();

        // Register users
        registration.registerUser("Alice");
        registration.registerUser("Bob");
        registration.registerUser("Charlie");

        // Display users
        System.out.println("Registered users:");
        registration.displayUsers();

        // Remove a user
        registration.removeUser("Bob");
        System.out.println("\nRegistered users after removing 'Bob':");
        registration.displayUsers();
    }
}
