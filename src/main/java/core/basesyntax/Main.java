package core.basesyntax;

public class Main {
    public static void main(String args) {
        UserService userService = new UserService();
        User user = null;
        assert user != null;
        userService.registerUser(user);
    }
}
