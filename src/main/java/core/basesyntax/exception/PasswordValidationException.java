package core.basesyntax.exception;

public class PasswordValidationException extends Exception {
    private String message;

    public PasswordValidationException(String message) {
        super(message);
        this.message = message;
    }
}
