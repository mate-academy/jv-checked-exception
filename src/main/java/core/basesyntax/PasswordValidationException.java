package core.basesyntax;

public class PasswordValidationException extends Exception {
    public PasswordValidationException() {
    }

    public PasswordValidationException(String message) {
        super(message);
    }
}
