package core.basesyntax;

public class PasswordValidationException extends Exception {
    public PasswordValidationException() {
        super("Wrong passwords");
    }

    public PasswordValidationException(String message) {
        super(message);
    }
}



