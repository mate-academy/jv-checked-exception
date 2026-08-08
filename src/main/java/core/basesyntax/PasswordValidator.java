package core.basesyntax;

public class PasswordValidator {
    private static final int PASS_MIN_LENGTH = 10;

    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        //write your code here

        if (password == null || repeatPassword == null || !password.equals(repeatPassword)
                || password.length() < PASS_MIN_LENGTH) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
