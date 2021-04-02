package core.basesyntax;

import core.basesyntax.exception.PasswordValidationException;

public class PasswordValidator {
    public boolean validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (password == null | repeatPassword == null) {
            throw new PasswordValidationException("Password or repeated password i null");
        }
        if (password.length() >= 10 && repeatPassword.length() >= 10
                && password.equals(repeatPassword)) {
            return true;
        }
        throw new PasswordValidationException("Wrong passwords");
    }
}
