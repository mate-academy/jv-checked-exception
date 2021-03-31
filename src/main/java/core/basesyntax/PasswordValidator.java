package core.basesyntax;

import core.basesyntax.exception.PasswordValidationException;

public class PasswordValidator {
    public static final int MIN_PASSWORD_LENGTH = 10;

    public boolean validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (password == null || !(password.equals(repeatPassword))
                || password.length() < MIN_PASSWORD_LENGTH) {
            throw new PasswordValidationException("Wrong passwords");
        }
        return true;
    }
}
