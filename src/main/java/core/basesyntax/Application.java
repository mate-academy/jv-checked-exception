package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        User user = new User("login@email", "Test_1233", "Test_12345");
        UserService userService = new UserService();
        userService.registerUser(user);
    }
}
