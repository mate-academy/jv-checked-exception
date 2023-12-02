package core.basesyntax;

public class PasswordValidationException extends Exception {

    public PasswordValidationException(String validLengthOfPassword) {
        super(validLengthOfPassword);
    }
}

