package core.basesyntax;

import java.util.Objects;

public class PasswordValidator {
    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (Objects.isNull(password) || Objects.isNull(repeatPassword)) {
            throw new PasswordValidationException("Passwords must not be null");
        }
        if (password.isEmpty() && repeatPassword.isEmpty()
                || !password.equals(repeatPassword)
                || password.length() < 10) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
