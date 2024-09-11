package core.basesyntax;

import org.jetbrains.annotations.NotNull;

public class PasswordValidator {
    private static final int PASSWORD_LENGTH = 10;

    public void validate(@NotNull String password, String repeatPassword)
            throws PasswordValidationException {
        if (!password.equals(repeatPassword) || password.length() < PASSWORD_LENGTH) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
