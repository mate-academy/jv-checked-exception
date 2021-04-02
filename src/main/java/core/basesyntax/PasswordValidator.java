package core.basesyntax;

import core.basesyntax.exception.PasswordValidationException;

public class PasswordValidator {
    public boolean validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (password == null || repeatPassword == null) {
            throw new PasswordValidationException("Wrong passwords");
        }
        boolean isValidated = password.equals(repeatPassword) && password.length() >= 10;
        if (!isValidated) {
            throw new PasswordValidationException("Wrong passwords");
        }
        return true;
    }
}
