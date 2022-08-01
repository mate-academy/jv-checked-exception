package core.basesyntax;

import core.basesyntax.exceptions.PasswordValidationException;

public class PasswordValidator {
    public void validate(String password, String repeatPassword) throws PasswordValidationException {
        if (password.length() < 10 && repeatPassword.length() < 10) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
