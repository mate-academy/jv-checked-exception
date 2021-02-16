package core.basesyntax;

import core.basesyntax.exception.PasswordValidationException;

public class PasswordValidator {
    public boolean validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (password == null && repeatPassword == null) {
            throw new PasswordValidationException("Wrong passwords");
        }
        if (password.length() < 10 && repeatPassword.length() < 10
                || !password.equals(repeatPassword)) {
            throw new PasswordValidationException("Wrong passwords");
        } else {
            return true;
        }
    }
}
