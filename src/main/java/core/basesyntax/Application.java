package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        User validUser = new User("test@example.com",
                "securepassword123", "securepassword123");
        User invalidUser = new User("user@example.com", "short", "short");

        UserService userService = new UserService();

        System.out.println("Registering valid user:");
        userService.registerUser(validUser);

        System.out.println("\nRegistering invalid user:");
        userService.registerUser(invalidUser);
    }
}
