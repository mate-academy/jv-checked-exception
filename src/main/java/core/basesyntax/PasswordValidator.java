package core.basesyntax;

import java.util.Objects;

public class PasswordValidator {
    private static final String PASSWORD_VALIDATION_EXCEPTION_MESSAGE = "Wrong passwords";

    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (Objects.isNull(password) || Objects.isNull(repeatPassword)
                || !password.equals(repeatPassword) || password.length() < 10) {
            throw new PasswordValidationException(PASSWORD_VALIDATION_EXCEPTION_MESSAGE);
        }
    }
}
