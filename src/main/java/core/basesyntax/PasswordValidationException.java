package core.basesyntax;

public class PasswordValidationException extends Exception {
    public PasswordValidationException(String wrongPasswords) {
        System.out.println(wrongPasswords);
    }
}
