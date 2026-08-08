package core.basesyntax;

public class ExampleUsage {
    public static void main(String[] args) {
        UserService userService = new UserService();

        User validUser = new User("john.doe@example.com", "securePassword123", "securePassword123");
        userService.registerUser(validUser);
        User invalidUser = new User("jane.doe@example.com", "short", "short");
        userService.registerUser(invalidUser);
    }
}
