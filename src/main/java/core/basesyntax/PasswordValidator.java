package core.basesyntax;

public class PasswordValidator {
    private static final int PASSWORD_LENGTH = 10;

    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (password == null || repeatPassword == null) {
            throw new PasswordValidationException("Password cannot be null");
        }
        if (!password.equals(repeatPassword) || password.length() < PASSWORD_LENGTH
                && repeatPassword.length() < PASSWORD_LENGTH) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
