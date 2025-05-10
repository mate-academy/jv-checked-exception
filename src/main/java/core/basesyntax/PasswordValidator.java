package core.basesyntax;

public class PasswordValidator {
    private static final int SMALLEST_PASSWORD_LENGTH = 10;

    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        //write your code here
        if (password == null || repeatPassword == null
                || password.length() < 10 || !(password.equals(repeatPassword))) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
