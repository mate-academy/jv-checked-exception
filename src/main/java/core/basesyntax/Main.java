package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserService();

        User user1 = new User("test@example.com", "securepassword", "securepassword");
        userService.registerUser(user1); // Успішна реєстрація

        User user2 = new User("invalid@example.com", "short", "short");
        userService.registerUser(user2); // Ваші паролі неправильні. Повторіть спробу.
    }
}
