package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserService();

        // Correct passwords
        User user1 = new User("user1@example.com", "password123", "password123");
        userService.registerUser(user1);

        // Incorrect passwords
        User user2 = new User("user2@example.com", "password", "password123");
        userService.registerUser(user2);
    }
}
