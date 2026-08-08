package core.basesyntax;

public class PasswordValidator {
    private static final int MIN_PASSWORDS_LENGTH = 10;
    private static final String WRONG_PASSWORDS_MESSAGE = "Wrong passwords";

    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (password == null || !password.equals(repeatPassword)
                || password.length() < MIN_PASSWORDS_LENGTH) {
            throw new PasswordValidationException(WRONG_PASSWORDS_MESSAGE);
        }
    }
}
