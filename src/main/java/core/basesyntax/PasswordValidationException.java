package core.basesyntax;
public class PasswordValidationException extends Exception {
    public PasswordValidationException(String message) {
        System.out.println(message);
        //super(message);
    }
}

