package core.basesyntax;

public class PasswordValidator {
    public void validate(String password, String repeat) throws PasswordValidationException {
        //write your code here
        if (password == null || repeat == null ||
            password.length() < 10 || repeat.length() < 10 ||
            !password.equals(repeat)) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}