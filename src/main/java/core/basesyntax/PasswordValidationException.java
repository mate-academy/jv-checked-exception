package core.basesyntax;

import java.io.IOException;

public class PasswordValidationException extends IOException {
    public PasswordValidationException() {
        super();
    }

    public PasswordValidationException(String message) {
        super(message);
    }

}
