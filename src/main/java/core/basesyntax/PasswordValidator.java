package core.basesyntax;

import core.basesyntax.exception.PasswordValidationException;

public class PasswordValidator {
    private static final int PASSWORD_LENGTH = 10;

    public boolean validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (password != null
                && password.equals(repeatPassword)
                && password.length() >= PASSWORD_LENGTH) {
            return true;
        }
        throw new PasswordValidationException("Wrong passwords");
    }
}
