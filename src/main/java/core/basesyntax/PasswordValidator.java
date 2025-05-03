package core.basesyntax;

public class PasswordValidator {
    private static final int MIN_PASSWORD_LENGTH = 10;

    public void validate(String password, String repeatPassword) throws PasswordValidationException {
        if (password == null || repeatPassword == null) {
            throw new PasswordValidationException("Passwords cannot be null.");
        }
        if (!password.equals(repeatPassword)) {
            throw new PasswordValidationException("Passwords do not match.");
        }
        if (password.length() < MIN_PASSWORD_LENGTH) {
            throw new PasswordValidationException("Password must be at least " + MIN_PASSWORD_LENGTH + " characters long.");
        }
    }
}