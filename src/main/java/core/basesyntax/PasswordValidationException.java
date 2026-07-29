package core.basesyntax;

public class PasswordValidationException extends Exception {
    public PasswordValidationException() {
        super(); // Call the superclass constructor
    }

    public PasswordValidationException(String message) {
        super(message); // Call the superclass constructor with a custom message
    }
}
