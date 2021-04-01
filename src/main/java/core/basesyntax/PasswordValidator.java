package core.basesyntax;

import core.basesyntax.exception.PasswordValidationException;

public class PasswordValidator {
    public boolean validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (password == null
                || !password.equals(repeatPassword)
                || password.length() < 8) {
            throw new PasswordValidationException("Wrong passwords");

        }
        return true;
    }

}
