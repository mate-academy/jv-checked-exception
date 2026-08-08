package core.basesyntax;

public class PasswordValidationException extends Exception {
    public PasswordValidationException(String message) {
        super(message);
    }

    public void authenticate(String login, String password) {

    }
}
