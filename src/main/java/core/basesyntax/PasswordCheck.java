package core.basesyntax;

public class PasswordCheck {
    public static void main(String[] args) throws PasswordValidationException {
        UserService userService = new UserService();

        User user = new User("MMmate@gmail.com", "MMmate123456789",
                "MMmate123456789");

        userService.registerUser(user);
    }
}
