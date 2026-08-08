package core.basesyntax;

public class PasswordValidator {
    private static final String MESSAGE_EXCEPTION = "Wrong passwords";
    private static final int MIN_LENGTH_PASSWORD = 10;

    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        try {
            if (!password.equals(repeatPassword)) {
                throw new PasswordValidationException(MESSAGE_EXCEPTION);
            }
            if (password.length() < MIN_LENGTH_PASSWORD) {
                throw new PasswordValidationException(MESSAGE_EXCEPTION);
            }
        } catch (RuntimeException e) {
            throw new PasswordValidationException(MESSAGE_EXCEPTION);
        }
    }
}
