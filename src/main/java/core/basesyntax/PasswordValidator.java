package core.basesyntax;

public class PasswordValidator {
    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        UserService service2 = new UserService();
        User user = new User();
        if (!password.equals(repeatPassword) || password.length() <= 10) {
            throw new PasswordValidationException("Your passwords are incorrect. Try again.");
        } else {
            service2.saveUser(user);
        }
    }
}
