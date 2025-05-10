package core.basesyntax;

public class PasswordValidator {
    private static final int MINIMUM_PASSWORD_LENGTH = 10;

    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        //write your code here
        if (password == null
                || password.length() != repeatPassword.length()
                || password.length() < MINIMUM_PASSWORD_LENGTH
                || !password.equals(repeatPassword)) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
