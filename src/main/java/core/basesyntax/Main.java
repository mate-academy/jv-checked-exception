package core.basesyntax;

public class Main {
    public static void main(String[] args) throws PasswordValidationException {
        UserService userService = new UserService();
        User user = new User("email", "12345678", "1234567890");
        userService.registerUser(user);
    }
}
