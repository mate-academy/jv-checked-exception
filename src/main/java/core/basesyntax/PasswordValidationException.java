package core.basesyntax;

//write your code here
public class PasswordValidationException extends Exception {

    public PasswordValidationException() {
        super("Wrong passwords");
    }

    public PasswordValidationException(String msg) {
        super(msg);
    }
}
