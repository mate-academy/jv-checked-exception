package core.basesyntax;

public class PasswordValidator {
    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        //write your code here
        String message = null;
        if (password == null) {
            message = "Password shouldn't be empty";
        } else if (repeatPassword == null) {
            message = "Repeat Password shouldn't be empty";
        } else if (password.length() < 10 | !(password.equals(repeatPassword))) {
            message = "Wrong passwords";
        }
        if (message != null) {
            throw new PasswordValidationException(message);
        }
    }
}
