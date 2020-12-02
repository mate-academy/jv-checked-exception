package core.basesyntax;

public class PasswordValidationException extends Exception {

    public PasswordValidationException() {
        super("Wrong passwords");
    }
}
