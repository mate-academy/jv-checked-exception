package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserService();

        userService.registerUser("password123", "pass123");

        userService.registerUser("password123", "password123");
    }
}
