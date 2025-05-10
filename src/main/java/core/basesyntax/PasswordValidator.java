package core.basesyntax;

public class PasswordValidator {
    public static final int MIN_LENGTH = 10;

    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        //write your code here
        if (password == null || repeatPassword == null || password.length() < MIN_LENGTH
                || repeatPassword.length() < MIN_LENGTH
                || !password.equals(repeatPassword)) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
