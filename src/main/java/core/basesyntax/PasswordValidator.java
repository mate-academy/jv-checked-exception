package core.basesyntax;

public class PasswordValidator {
    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (password != null && password.equals(repeatPassword)
                && password.length() >= 10
                && repeatPassword.length() >= 10) {
            return;
        }
        //write your code here
        throw new PasswordValidationException("Wrong passwords");
    }
}
