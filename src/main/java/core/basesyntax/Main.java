package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserService();

        User user = new User("example@example.com", "password123", "password123");
        userService.registerUser(user);

        User wrongUser = new User("invalid@example.com", "pass", "pass");
        userService.registerUser(wrongUser);
    }
}
