package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        PasswordValidator passwordValidator = new PasswordValidator();
        UserService userService = new UserService(passwordValidator);

        User user = new User("test@example.com", "password123", "password123");
        userService.registerUser(user);
    }
}
