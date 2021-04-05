package core.basesyntax;

import core.basesyntax.exception.PasswordValidationException;

public class PasswordValidator {
    private static final String MESSAGE_PASSWORD_HAS_NULL = "password or repeatPassword is null";
    private static final String MESSAGE_PASSWORDS_ARE_WRONG = "Wrong passwords";

    public boolean validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (password == null || repeatPassword == null) {
            throw new PasswordValidationException(MESSAGE_PASSWORD_HAS_NULL);
        }
        if (!(password.equals(repeatPassword) && password.length() >= 10)) {
            throw new PasswordValidationException(MESSAGE_PASSWORDS_ARE_WRONG);
        }
        return true;
    }
}
