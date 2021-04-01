package core.basesyntax.exception;

public class PasswordValidationException extends RuntimeException {

    public PasswordValidationException(String massage) {
        super(massage);
    }
}
