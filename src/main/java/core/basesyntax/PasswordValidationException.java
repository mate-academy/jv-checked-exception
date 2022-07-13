package core.basesyntax;

public class PasswordValidationException extends Exception {
    public PasswordValidationException(String message) {
        super("Wrong passwords");
    }
}
