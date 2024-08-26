package core.basesyntax;

public class PasswordValidationException extends RuntimeException {
    public PasswordValidationException(String massage) {
        super(massage);
    }
}
