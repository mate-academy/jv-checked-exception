package core.basesyntax;

public class PasswordValidator {
    private static final int MINIMAL_PASSWORD_VALUE = 10;

    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        //write your code here
        if (password == null || !password.equals(repeatPassword)
                || password.length() < MINIMAL_PASSWORD_VALUE) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
