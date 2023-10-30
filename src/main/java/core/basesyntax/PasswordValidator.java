package core.basesyntax;

public class PasswordValidator {
    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        //write your code here
        if ((password != null) && (password == repeatPassword) && (password.length() >= 10)) {
            return;
        } else {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
