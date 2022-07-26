package core.basesyntax;

public class PasswordValidationException extends Exception {
    public PasswordValidationException(String message) {
        super(message);
    }

    public void getMessage(String s) {
        System.out.println(s);
    }
}
