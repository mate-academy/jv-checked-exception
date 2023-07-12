package core.basesyntax;
public class TestClass {
    public static void main(String[] args) {
        User user = new User("user@example.com", "password123", "password123");
        UserService userService = new UserService();
        userService.registerUser(user);
    }
}


