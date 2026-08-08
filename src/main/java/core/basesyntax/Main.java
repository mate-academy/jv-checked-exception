package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserService();

        // Example of registering a user with valid password
        User validUser = new User("test@example.com", "validpassword123", "validpassword123");
        userService.registerUser(validUser);

        // Example of registering a user with invalid password
        User invalidUser = new User("test@example.com", "short", "short");
        userService.registerUser(invalidUser);
    }
}
