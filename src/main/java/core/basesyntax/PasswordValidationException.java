package core.basesyntax;

public class PasswordValidationException extends Exception {
    private String message;

    public PasswordValidationException(String message) {
        super(message);
    }
}
