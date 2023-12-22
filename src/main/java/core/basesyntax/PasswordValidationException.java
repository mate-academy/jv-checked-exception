package core.basesyntax;

public class PasswordValidationException extends Exception {
    public PasswordValidationException(String errorMessage) {
        super(errorMessage);
    }
}
