package core.basesyntax;

public class PasswordValidator {
    public void validate(String password, String repeatPassword) throws PasswordValidationException {
        //write your code here
    final int MIN_PASSWORD_LENGTH = 10;
        if (password == null
                || !password.equals(repeatPassword)
                || password.length() < MIN_PASSWORD_LENGTH) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
