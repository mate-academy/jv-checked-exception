package core.basesyntax;

import core.basesyntax.exception.PasswordValidationException;

public class PasswordValidator {
    protected static boolean validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (password != null && repeatPassword != null) {
            if (password.equals(repeatPassword) && password.length() >= 10) {
                return true;
            }
        }
        throw new PasswordValidationException("Wrong passwords");
    }
}
