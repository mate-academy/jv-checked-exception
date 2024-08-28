package core.basesyntax;

public class Main {
    public static void main(String[] args) throws PasswordValidationException {
        User user = new User();
        user.setEmail("nikolya.cr@gmail.com");
        user.setPassword("12345678910");
        user.setRepeatPassword("12345678910");
        UserService service = new UserService();
        service.registerUser(user);
    }
}
