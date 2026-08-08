package core.basesyntax;

public class PasswordValidationException extends Exception {
    public PasswordValidationException() {
        super();
    }

    public PasswordValidationException(String massage) {
        super(massage);
    }
}
