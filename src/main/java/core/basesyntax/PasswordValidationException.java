package core.basesyntax;

//write your code here
public class PasswordValidationException extends Exception {
    //create your exception User with given email doesn't exist
    public PasswordValidationException(String message) {
        super(message);
    }
}
