package core.basesyntax;

public class PasswordValidationException extends IllegalArgumentException {
    public PasswordValidationException(String message) {
        super(message);
    }
}
