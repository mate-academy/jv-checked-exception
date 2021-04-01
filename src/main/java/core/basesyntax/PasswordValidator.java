package core.basesyntax;

import core.basesyntax.exception.PasswordValidationException;

public class PasswordValidator {
    public boolean validate(String password, String repeatPassword)
                    throws PasswordValidationException {
        if (repeatPassword.equals(password) && password.length() >= 10
            && !password.equals(null) || !repeatPassword.equals(null)) {
            return true;
        }
        throw new PasswordValidationException("Wrong passwords");
    }
}
