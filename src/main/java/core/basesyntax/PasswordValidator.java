package core.basesyntax;

public class PasswordValidator {
    private static final int LENGTH_OF_PASSWORD = 10;
    private static final String MESSAGE = "Wrong passwords";

    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (password == null || !password.equals(repeatPassword)
                || password.length() < LENGTH_OF_PASSWORD) {
            throw new PasswordValidationException(MESSAGE);
        }
    }
}
