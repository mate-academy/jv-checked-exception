package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        User alice = new User("alice@mail", "qwe123asdf", "qwe123asdf");
        UserService userService = new UserService();
        userService.registerUser(alice);
    }
}
