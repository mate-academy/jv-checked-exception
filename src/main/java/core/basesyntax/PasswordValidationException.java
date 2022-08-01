package core.basesyntax;

public class PasswordValidationException extends Exception {
    public PasswordValidationException() {
        super();
    }

    public PasswordValidationException(String message) {
        super(message);
    }

    public PasswordValidationException(String message, Throwable cause) {
        super(message, cause);
    }
}
