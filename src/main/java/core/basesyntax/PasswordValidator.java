package core.basesyntax;

import core.basesyntax.exceptions.PasswordValidationException;

public class PasswordValidator {

    public boolean validate(String password,
                            String repeatPassword) throws PasswordValidationException {

        if(repeatPassword.length() >= 10 && password.length() >= 10) {
            return true;
        } else {
            throw new PasswordValidationException("Wrong password");
        }
    }
}
