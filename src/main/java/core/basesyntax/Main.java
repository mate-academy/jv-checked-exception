package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserService();
        User user = new User("someGmail@gmail.com", "somePassword", "somePassword");
        userService.registerUser(user);
    }
}
