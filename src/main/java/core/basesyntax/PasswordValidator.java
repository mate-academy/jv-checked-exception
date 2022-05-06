package core.basesyntax;

import java.io.IOException;

public class PasswordValidator {
    public static void validate(String password, String repeatPassword) throws IOException {
        if (!(password.equals(repeatPassword) && password.length() >= 10)) {
            throw new PasswordValidationException("Направильні паролі");
        }

    }
}
