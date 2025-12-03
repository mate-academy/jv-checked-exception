package core.basesyntax;

public class PasswordValidationException extends RuntimeException {
    public PasswordValidationException() {
        super("Wrong passwords");
    }
}
