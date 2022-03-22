package core.basesyntax;

public class PasswordValidationException extends Error {
    public PasswordValidationException(String errorMessage){
        super(errorMessage);
    }
}
