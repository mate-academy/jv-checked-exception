package core.basesyntax;

public class PasswordValidator {
    private static final int MAX_LENGTH_PASSWORD = 10;

    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (password == null || repeatPassword == null) {
            throw new PasswordValidationException("Wrong passwords");
        }
        if (password.length() < MAX_LENGTH_PASSWORD || !repeatPassword.equals(password)) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
