package core.basesyntax;

public class PasswordValidator {
    private static final String ERROR_MESSAGE = "Wrong passwords";

    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (password == null || repeatPassword == null) {
            throw new PasswordValidationException(ERROR_MESSAGE);
        }

        if (password.length() < 10) {
            throw new PasswordValidationException(ERROR_MESSAGE);
        }

        if (!password.equals(repeatPassword)) {
            throw new PasswordValidationException(ERROR_MESSAGE);
        }
    }
}
