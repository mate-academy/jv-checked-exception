package core.basesyntax;

import core.basesyntax.exception.PasswordValidationException;

public class PasswordValidator {
    public boolean validate(String password, String repeatPassword)
                            throws PasswordValidationException {
        if (repeatPassword != null
                && repeatPassword.equals(password)
                && password.length() >= 10) {
            return true;
        }
        throw new PasswordValidationException("Wrong passwords");
    }
}
