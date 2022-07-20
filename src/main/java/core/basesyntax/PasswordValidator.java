package core.basesyntax;

import core.basesyntax.exceptions.PasswordValidationException;

public class PasswordValidator {
    public static final int PASS_LENGTH = 10;

    public static void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (password == null || repeatPassword == null) {
            throw new PasswordValidationException("Passwords shouldn't be empty");
        }
        if (!password.equals(repeatPassword) || password.length() < PASS_LENGTH) {
            throw new PasswordValidationException("Wrong passwords");
        }

    }
}
