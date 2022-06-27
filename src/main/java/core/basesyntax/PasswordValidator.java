package core.basesyntax;

import java.util.Objects;

public class PasswordValidator {
    static final int MINIMAL_PASSWORD_LENGTH = 10;

    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (password == null || repeatPassword == null) {
            throw new PasswordValidationException("Wrong passwords");
        }
        if ((!Objects.equals(password, repeatPassword)
                || (password.length() < MINIMAL_PASSWORD_LENGTH))) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
