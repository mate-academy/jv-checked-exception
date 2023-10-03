package core.basesyntax;

public class PasswordValidationException extends Exception {
    public PasswordValidationException(String wrongPasswords) {
        super(wrongPasswords);
    }
}
