package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        User bob = new User("bob@mail.com", null, null);
        User alice = new User("alice@mail.com", "12345", "54321");
        User john = new User("john@mail.com", "123456789qqqq", "123456789qqqq");

        UserService userService = new UserService();
        userService.registerUser(bob);
        userService.registerUser(alice);
        userService.registerUser(john);
    }
}

