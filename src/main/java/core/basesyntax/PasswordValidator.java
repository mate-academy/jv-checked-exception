package core.basesyntax;

public class PasswordValidator {
    private static final int MIN_PASSWORD_LENGTH = 10;
    private static final String EXCEPTION_MESSAGE = "Wrong passwords";

    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {

        if (password == null || password.isEmpty()
                || repeatPassword == null || repeatPassword.isEmpty()) {
            throw new PasswordValidationException(EXCEPTION_MESSAGE);
        }

        if (password.length() < MIN_PASSWORD_LENGTH) {
            throw new PasswordValidationException(EXCEPTION_MESSAGE);
        }

        if (!password.equals(repeatPassword)) {
            throw new PasswordValidationException(EXCEPTION_MESSAGE);
        }
    }
}
