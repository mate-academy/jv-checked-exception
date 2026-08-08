package core.basesyntax;

// Основний клас для тестування
public class Main {
    public static void main(String[] args) {
        UserService userService = new UserService();

        // Створення користувачів
        User user1 = new User("test@example.com", "securepassword", "securepassword");
        userService.registerUser(user1); // Успішна реєстрація

        User user2 = new User("invalid@example.com", "short", "short");
        userService.registerUser(user2); // Ваші паролі неправильні. Повторіть спробу.

        User user3 = new User("nulltest@example.com", null, "securepassword");
        userService.registerUser(user3); // Ваші паролі неправильні. Повторіть спробу.

        User user4 = new User("mismatch@example.com", "securepassword", "differentpassword");
        userService.registerUser(user4); // Ваші паролі неправильні. Повторіть спробу.
    }
}
