package core.basesyntax;

import core.basesyntax.exception.PasswordValidationException;

public class PasswordValidator {

    public static final int MINIMUM_PASSWORD_LENGTH = 10;

    public boolean validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (password == null || repeatPassword == null) {
            throw new PasswordValidationException("Wrong passwords");
        }
        if (password.length() < MINIMUM_PASSWORD_LENGTH
                || repeatPassword.length() < MINIMUM_PASSWORD_LENGTH) {
            throw new PasswordValidationException("Wrong passwords");
        }
        if (!password.equals(repeatPassword)) {
            throw new PasswordValidationException("Wrong passwords");
        }
        return true;
    }
}
