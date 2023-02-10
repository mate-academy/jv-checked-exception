package core.basesyntax;

public class PasswordValidationException extends Exception {
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

    public PasswordValidationException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
