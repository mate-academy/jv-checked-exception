package core.basesyntax.exceptions;

public class PasswordValidationException extends Exception {
    public PasswordValidationException(String password) {
        super(password);
    }
}
