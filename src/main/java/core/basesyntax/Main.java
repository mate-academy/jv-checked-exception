package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserService();

        // Тестування реєстрації користувача з правильними паролями
        userService.registerUser("securepassword123", "securepassword123");

        // Тестування реєстрації користувача з неправильними паролями
        userService.registerUser("short", "short");
    }
}
