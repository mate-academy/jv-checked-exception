package core.basesyntax;

public class PasswordValidator {
    private static final int DATA_LENGTH = 10;

    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (password == null || repeatPassword == null) {
            throw new PasswordValidationException("Passwords cannot be null");
        }
        if (password.length() < DATA_LENGTH || repeatPassword.length() < DATA_LENGTH) {
            throw new PasswordValidationException("Wrong passwords");
        }
        if (!password.matches(".*[A-Z].*") || !password.matches(".*[a-z].*")) {
            throw new PasswordValidationException("Passwords are not the same");
        }
    }
}
