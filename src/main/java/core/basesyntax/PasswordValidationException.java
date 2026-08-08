package core.basesyntax;

public class PasswordValidationException extends Exception {

    public PasswordValidationException(String message) {
        super(message);
    }

    public PasswordValidationException() {
        super("Wrong passwords");
    }
}
