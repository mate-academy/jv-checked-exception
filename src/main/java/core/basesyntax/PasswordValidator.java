package core.basesyntax;

import core.basesyntax.exception.PasswordValidationException;

public class PasswordValidator {
    public boolean validate(String password, String repeatPassword) throws
            PasswordValidationException {
        if (password != null && password.length() > 9 && password.equals(repeatPassword)) {
            return true;
        }
        throw new PasswordValidationException("Wrong passwords");
    }
}

