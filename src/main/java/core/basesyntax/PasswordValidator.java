package core.basesyntax;

public class PasswordValidator {
    static final int PASSWORD_LENGTH = 10;
    public void validate(String password, String repeatPassword) throws PasswordValidationException {
        //write your code here
        if (password == null || !password.equals(repeatPassword) || password.length() < PASSWORD_LENGTH) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
