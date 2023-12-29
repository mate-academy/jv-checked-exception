package core.basesyntax;

public class Main {
    public static void main(String[] args) throws PasswordValidationException {
        User user = new User("fedsaf", null, null);
        UserService userService = new UserService();
        userService.registerUser(user);
    }
}
