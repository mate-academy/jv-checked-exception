package core.basesyntax;

public class PasswordValidationException extends Exception {
    private final String message;

    public PasswordValidationException(String message) {
        super(message);
        this.message = message;
    }
}
