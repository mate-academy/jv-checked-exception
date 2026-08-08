package core.basesyntax;

public class PasswordValidator {
    private static final String WRONG_PASSWORDS_MESSAGE = "Wrong passwords";

    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (password == null || repeatPassword == null) {
            throw new PasswordValidationException(WRONG_PASSWORDS_MESSAGE);
        }

        if (!password.equals(repeatPassword)) {
            throw new PasswordValidationException(WRONG_PASSWORDS_MESSAGE);
        }

        if (password.length() < 10 && repeatPassword.length() < 10) {
            throw new PasswordValidationException(WRONG_PASSWORDS_MESSAGE);
        }
    }
}
