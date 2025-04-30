package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        User user = new User("login@email", "Test_1233333", "Test_1233333");
        UserService userService = new UserService();
        userService.registerUser(user);
    }
}
