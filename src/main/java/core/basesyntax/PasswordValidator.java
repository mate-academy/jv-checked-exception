package core.basesyntax;

import java.util.Objects;

public class PasswordValidator {
    private static final int MIN_PASS_LENGTH = 10;

    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (Objects.isNull(password)
                || Objects.isNull(repeatPassword)
                || password.length() < MIN_PASS_LENGTH
                || repeatPassword.length() < MIN_PASS_LENGTH
                || !password.equals(repeatPassword)) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
