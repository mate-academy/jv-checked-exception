package core.basesyntax;

import core.basesyntax.exception.PasswordValidationException;

public class PasswordValidator {
    public boolean validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (repeatPassword == null || password == null || password.length() == 0) {
            throw new PasswordValidationException("Wrong passwords");
        }

        if (!password.equals(repeatPassword)) {
            throw new PasswordValidationException("Wrong passwords");
        }

        if (password.length() < 10) {
            throw new PasswordValidationException("Wrong passwords");
        }

        return true;
    }
}
