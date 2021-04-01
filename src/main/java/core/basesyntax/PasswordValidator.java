package core.basesyntax;

import core.basesyntax.exception.PasswordValidationException;

public class PasswordValidator {
    private static final int PASSWORD_MAX_LENGTH = 10;

    public boolean validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (password != null
                && password.length() >= PASSWORD_MAX_LENGTH
                && password.equals(repeatPassword)) {
            return true;
        } else {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}

