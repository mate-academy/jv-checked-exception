package core.basesyntax;

public class PasswordValidator {
    private static final int MIN_LENGTH_PASSWORD = 10;
    private static final String MESSAGE1 = "Wrong passwords";

    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (password == null) {
            throw new PasswordValidationException(MESSAGE1);
        }
        if (!password.equals(repeatPassword) || password.length()
                < MIN_LENGTH_PASSWORD) {
            throw new PasswordValidationException(MESSAGE1);
        }
    }
}
