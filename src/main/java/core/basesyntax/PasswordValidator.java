package core.basesyntax;

import core.basesyntax.exceptions.PasswordValidationException;

public class PasswordValidator {
    public void validate(String password, String repeatPassword) throws PasswordValidationException {
        if (password < 10 && repeatPassword < 10) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
