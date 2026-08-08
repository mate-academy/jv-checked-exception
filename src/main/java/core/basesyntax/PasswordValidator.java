package core.basesyntax;

public class PasswordValidator {
    public static final int MIN_REQUIRED_PASS_LENGTH = 10;

    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (password == null || repeatPassword == null) {
            throw new PasswordValidationException("Wrong passwords");
        }
        if (password.length() < MIN_REQUIRED_PASS_LENGTH
                || repeatPassword.length() < MIN_REQUIRED_PASS_LENGTH) {
            throw new PasswordValidationException("Wrong passwords");
        }
        if (!password.equals(repeatPassword)) {
            throw new PasswordValidationException("Passwords do not match");
        }
    }
}
