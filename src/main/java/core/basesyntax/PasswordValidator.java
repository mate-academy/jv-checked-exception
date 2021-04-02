package core.basesyntax;

import core.basesyntax.exception.PasswordValidationException;

public class PasswordValidator {
    private static final int MIN_PASSWORD_LENGTH = 10;

    public boolean validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (password != null && repeatPassword != null
                && (password.equals(repeatPassword)
                && password.length() >= MIN_PASSWORD_LENGTH)) {
            return true;
        } else {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
