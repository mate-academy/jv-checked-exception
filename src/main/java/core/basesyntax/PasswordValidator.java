package core.basesyntax;

import core.basesyntax.exception.PasswordValidationException;

public class PasswordValidator {
    private static final String MESSAGE_PASSWORDS_ARE_WRONG = "Wrong passwords";

    public boolean validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (password != null && password.equals(repeatPassword) && password.length() >= 10) {
            return true;
        }
        throw new PasswordValidationException(MESSAGE_PASSWORDS_ARE_WRONG);
    }
}
