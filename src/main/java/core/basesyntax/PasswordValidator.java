package core.basesyntax;

public class PasswordValidator {
    static final String ERROR_MESSAGE = "Wrong passwords";
    static final int MAX_LENGTH = 10;

    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (password == null || repeatPassword == null) {
            throw new PasswordValidationException(ERROR_MESSAGE);
        }
        if (!password.equals(repeatPassword) || password.length() < MAX_LENGTH) {
            throw new PasswordValidationException(ERROR_MESSAGE);
        }
    }
}
