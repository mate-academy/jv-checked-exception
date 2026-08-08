package core.basesyntax;

import org.jetbrains.annotations.NotNull;

public class PasswordValidator {
    public void validate(@NotNull String password, String repeatPassword)
            throws PasswordValidationException {
        if (repeatPassword == null) {
            throw new PasswordValidationException("Password or repeatPassword is null");
        }

        if (!password.equals(repeatPassword) || password.length() < 10) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
