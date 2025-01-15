package core.basesyntax;

import java.util.Objects;

public class PasswordValidator {
    public boolean validate(String password, String repeatPassword) {
    if (password.equals(repeatPassword) && password.length() <= 10) {
        return true;
    } else {
        throw new PasswordValidationException("Wrong passwords");
    }
    }
}
