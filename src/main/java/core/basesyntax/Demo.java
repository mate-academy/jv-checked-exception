package core.basesyntax;

public class Demo {
    public static void main(String[] args) {
        User user = new User("test@gmail.com", "1234", "12333");
        UserService userService = new UserService();

        userService.registerUser(user);
    }
}
