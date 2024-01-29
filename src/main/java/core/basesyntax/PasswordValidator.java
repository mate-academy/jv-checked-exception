package core.basesyntax;

public class PasswordValidator {
    public static final int REQUIRED_PASSWORD_LENGTH = 10;

    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (password == null
                || repeatPassword == null
                || password.length() < REQUIRED_PASSWORD_LENGTH
                || repeatPassword.length() < REQUIRED_PASSWORD_LENGTH
                || !password.equals(repeatPassword)) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
