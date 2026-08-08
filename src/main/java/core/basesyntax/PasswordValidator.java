package core.basesyntax;

public class PasswordValidator {
    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        //write your code here
        if (password == null) {
            throw new PasswordValidationException("Wrong passwords");
        } else if (password != repeatPassword || password.length() < 10) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
