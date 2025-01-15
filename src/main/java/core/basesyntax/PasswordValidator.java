package core.basesyntax;

import java.util.Objects;

public class PasswordValidator {

    public void validate(String password, String repeatPassword) {

    if (!(password.equals(repeatPassword)) || !(password.length() <= 10)) {
        throw new PasswordValidationException("Wrong passwords");
    }

    }
}
