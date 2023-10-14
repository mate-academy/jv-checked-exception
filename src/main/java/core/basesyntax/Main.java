package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        User user = new User("hello", null, null);

        UserService userService = new UserService();
        userService.registerUser(user);
    }
}
