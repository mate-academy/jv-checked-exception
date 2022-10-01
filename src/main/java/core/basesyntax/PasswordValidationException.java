package core.basesyntax;

public class PasswordValidationException extends Exception {
    public PasswordValidationException(String password) {
        super(password);
    }
}
