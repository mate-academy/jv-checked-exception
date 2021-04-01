package core.basesyntax;

import core.basesyntax.PasswordValidationException.PasswordValidationException;

public class PasswordValidator {
    public boolean validate(String password, String repeatPassword) {
        if (password.equals(repeatPassword) && password.length() > 10 ) {
        throw new PasswordValidationException("Wrong passwords");
        }
        return true;
    }
}
