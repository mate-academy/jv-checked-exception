package core.basesyntax;

import java.util.Objects;

public class PasswordValidator {
    private static final int maxLength = 10;
    private static final PasswordValidationException pw =
            new PasswordValidationException("Wrong passwords");

    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if ((password != null && password.length() < maxLength)
                || (repeatPassword != null && repeatPassword.length() < maxLength)) {
            throw pw;
        }
        if (password == null || repeatPassword == null) {
            throw pw;
        }
    }
}
