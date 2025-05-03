package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        UserRepository userRepository = new UserRepository();
        PasswordValidator passwordValidator = new PasswordValidator();
        UserService userService = new UserService(userRepository, passwordValidator);

        // Valid case
        userService.registerUser("john_doe", "strongPassword123", "strongPassword123");

        // Invalid password (too short)
        userService.registerUser("jane_doe", "short", "short");

        // Passwords do not match
        userService.registerUser("john_smith", "password1234", "password5678");
    }
}