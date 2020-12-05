package core.basesyntax;

import core.basesyntax.exception.PasswordValidationException;

public class PasswordValidator {
    public boolean validate(String password, String repeatPassword) {
        boolean isValidated = password.length() >= 10 && password.equals(repeatPassword)
                && password != null;
        if (!isValidated) {
            throw new PasswordValidationException("Wrong passwords");
        }
        return true;
    }
}
