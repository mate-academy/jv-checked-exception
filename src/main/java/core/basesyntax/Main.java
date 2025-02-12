package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserService();
        // реєстрація користувача

        userService.registerUser("correct@example.com", "securePassword123", "securePassword123");
        userService.registerUser("mismatch@example.com", "password1234", "password5678");

    }
}
