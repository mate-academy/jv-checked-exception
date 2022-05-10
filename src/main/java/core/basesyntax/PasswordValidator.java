package core.basesyntax;

public class PasswordValidator {
    private static final int ALLOWED_PASSWORD_LENGTH = 10;

    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (password == null || repeatPassword == null) {
            throw new PasswordValidationException("Wrong passwords");
        }
        if (!password.equals(repeatPassword) || password.length() < ALLOWED_PASSWORD_LENGTH
                || repeatPassword.length() < ALLOWED_PASSWORD_LENGTH) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
