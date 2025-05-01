package core.basesyntax;

public class PasswordValidator {
    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        PasswordValidationException exception = new PasswordValidationException("Wrong passwords");
        //write your code here
        if (password == null || repeatPassword == null) {
            throw exception;
        }
        if (password.length() < 10 && repeatPassword.length() < 10) {
            throw exception;
        }
        if (!password.equals(repeatPassword)) {
            throw exception;
        }
    }
}
