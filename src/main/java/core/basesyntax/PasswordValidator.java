package core.basesyntax;

public class PasswordValidator {
    private static final int MIN_PASSWORD_LENGTH = 10;
    UserService userService = new UserService();
    public void validate(String password, String repeatPassword) throws PasswordValidationException{
        if (password.length() < MIN_PASSWORD_LENGTH && !password.equals(repeatPassword)) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
