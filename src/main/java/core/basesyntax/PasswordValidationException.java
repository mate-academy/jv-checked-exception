package core.basesyntax;

import java.io.IOException;

class PasswordValidationException extends IOException {
    public PasswordValidationException(String message) {
        super(message);
    }
}
