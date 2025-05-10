package core.basesyntax;

public class Application {
    public static void main(String[] args) throws PasswordValidationException {
        User user = new User("email@email", "password1234", "password1234");
        UserService userService = new UserService();
        userService.registerUser(user);
    }
}
