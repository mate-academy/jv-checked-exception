package core.basesyntax;

public class PasswordValidator {
    private static final int MIN_LENGTH = 10;

    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        //write your code here
        if (password == null
                || !password.equals(repeatPassword)
                || password.length() < MIN_LENGTH) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
