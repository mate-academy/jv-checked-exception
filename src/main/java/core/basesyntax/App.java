package core.basesyntax;

public class App {
    public static void main(String[] args) {
        UserService userService = new UserService();
        User user = new User("email@.com", "12345678901", "1234567890");
        userService.registerUser(user);
    }
}
