package core.basesyntax;

public class PasswordValidator {

    private User user;

    public void validate(String password, String repeatPassword) throws PasswordValidationException {
        if (password.length() <= 10 && password.equals(repeatPassword)) {
            UserService userService = new UserService();
            userService.saveUser(user);
        } else {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
