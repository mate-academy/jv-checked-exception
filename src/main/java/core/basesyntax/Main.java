package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserService();

        // Тестування реєстрації користувача з правильними паролями
        User user1 = new User("user1@example.com", "securepassword123", "securepassword123");
        userService.registerUser(user1);

        // Тестування реєстрації користувача з неправильними паролями
        User user2 = new User("user2@example.com", "short", "short");
        userService.registerUser(user2);
    }
}
