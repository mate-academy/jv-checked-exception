package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        User user = new User("Litvyvanya@gmail.com",
                "qwerty123456",
                "qwerty123456");
        UserService userService = new UserService();
        userService.registerUser(user);
    }
}
