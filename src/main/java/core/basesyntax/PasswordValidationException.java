package core.basesyntax;

public class PasswordValidationException extends Exception {
    public PasswordValidationException(String message) {
        System.err.println(message);
    }
}

