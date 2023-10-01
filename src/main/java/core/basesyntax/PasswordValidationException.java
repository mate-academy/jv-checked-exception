package core.basesyntax;

public class PasswordValidationException extends Exception {
    PasswordValidationException() {
        super();
    }

    PasswordValidationException(String message) {
        super(message);
    }
}
