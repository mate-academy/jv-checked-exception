package core.basesyntax;

import core.basesyntax.exception.PasswordValidationException;

public class PasswordValidator {
    public boolean validate(String password, String repeatPassword)
            throws PasswordValidationException {
        boolean result = true;
        if (password == null || repeatPassword == null) {
            throw new PasswordValidationException("Wrong passwords");
        }
        if (password.length() < 10 || !password.equals(repeatPassword)) {
            throw new PasswordValidationException("Wrong passwords");
        }
        return result;
    }
}
