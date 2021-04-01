package core.basesyntax;

import core.basesyntax.exception.PasswordValidationException;

public class PasswordValidator {
    public boolean validate(String password, String repeatPassword) throws PasswordValidationException {
        if (password.equals(repeatPassword) && password.length() >= 10) {
            return true;
        } else {
            throw new PasswordValidationException("Wrong passwords or length less than 10");
        }
    }
}
