package core.basesyntax;

import java.util.Objects;

public class PasswordValidator {
    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (password == null || repeatPassword == null
                || password.length() < 10
                || !Objects.equals(password, repeatPassword)) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
