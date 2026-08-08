package core.basesyntax;

import java.util.Objects;

public class PasswordValidator {
    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (password == null && repeatPassword == null || !Objects.equals(password, repeatPassword)
                || repeatPassword.length() < 10) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
