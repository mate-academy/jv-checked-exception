package core.basesyntax.exception;

import java.io.IOException;

public class PasswordValidationException extends IOException {
    public PasswordValidationException(String message) {
        super(message);
    }
}
