package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        User user = new User("mail@ukr.net", "t1234567890", "t1234567890");
        UserService userService = new UserService();
        userService.registerUser(user);
    }
}
