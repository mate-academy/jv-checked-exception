package core.basesyntax;

import java.util.Locale;

public class PasswordValidator {
    public void validate(String password, String repeatPassword) throws PasswordValidationException {
        if (password == null || repeatPassword == null |!password.equals(repeatPassword) | password.length() < 9) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
