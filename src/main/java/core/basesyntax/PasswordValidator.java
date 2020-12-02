package core.basesyntax;

import core.basesyntax.exception.PasswordValidationException;

public class PasswordValidator {
    public boolean validate(String password, String repeatPassword) throws PasswordValidationException {

        if (password == null || password.length() < 10) {
            throw new PasswordValidationException("Wrong passwords");
        } else if (!password.equals(repeatPassword)) {
            throw new PasswordValidationException("Your passwords are incorrect. Try again.");
        } else {
            return true;
        }
    }
}
