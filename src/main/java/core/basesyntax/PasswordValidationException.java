package core.basesyntax;

import java.util.concurrent.ExecutionException;

class PasswordValidationException extends ExecutionException {
    public PasswordValidationException(String message) {
        super(message);
    }
}
