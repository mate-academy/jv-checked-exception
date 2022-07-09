package core.basesyntax;

public class PasswordValidator {
    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (repeatPassword == null || repeatPassword.length() < 10
                || !repeatPassword.equals(password)) {
            throw new PasswordValidationException("Wrong passwords");
        }
        //write your code here
    }
}
