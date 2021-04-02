package core.basesyntax;

import core.basesyntax.exception.PasswordValidationException;

public class PasswordValidator {
    private static final int MIN_PASSWORD_LENGTH = 8;

    public boolean validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (password != null && password.equals(repeatPassword)
                && password.length() >= MIN_PASSWORD_LENGTH) {
            return true;
        }
        throw new PasswordValidationException("Wrong passwords");
    }
}
