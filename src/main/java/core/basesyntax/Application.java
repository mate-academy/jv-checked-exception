package core.basesyntax;

public class Application {
    public static void main(String[] args) throws PasswordValidationException {
        User user = new User("test@mail.com", "1234567890" , "1234567890");
        UserService userService = new UserService();
        userService.registerUser(user);
    }
}
