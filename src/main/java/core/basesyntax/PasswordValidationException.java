package core.basesyntax;

import java.io.IOException;

class PasswordValidationException extends Exception {
    public PasswordValidationException() {
    }

    public PasswordValidationException(String message) {
        super(message);
    }

    public PasswordValidationException(String message, Throwable cause) {
        super(message, cause);
    }

    public PasswordValidationException(Throwable cause) {
        super(cause);
    }
}

