package core.basesyntax;

// Клас для винятків (спеціальна логіка)
public class PasswordValidationException extends Exception {
    public PasswordValidationException(String message) {
        super(message);
    }
}
