package core.basesyntax;

import java.io.IOException;

public class PasswordValidator {
    private final static int MIN_LENGTH = 10;

    public void validate(String password, String repeatPassword) {
        if (password == null || repeatPassword == null) {
            throw new PasswordValidationException("Wrong passwords");
        }

        if ((password.length() < MIN_LENGTH || repeatPassword.length() < MIN_LENGTH) {
            throw new PasswordValidationException("Wrong passwords");
        }

        if (!password.equals(repeatPassword)) {
            throw new PasswordValidationException("Wrong passwords");
        }

    }

}
