package core.basesyntax;

public class Main {

    public static void main(String[] args) {
        User user = new User("login@email", null, null);
        UserService userService = new UserService();
        userService.registerUser(user);
    }
}
