package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserService();

        // Test registering a user
        User user = new User("john.doe@example.com", "password1234", "password1234");
        userService.registerUser(user);
    }
}
