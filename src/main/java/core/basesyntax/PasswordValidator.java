package core.basesyntax;

public class PasswordValidator {
    private static final int PASSWORD_LENGTH = 10;
    private static final String ERROR_WRONG = "Wrong passwords";

    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        //write your code here
        if ((password.length() < PASSWORD_LENGTH) || (repeatPassword.length() < PASSWORD_LENGTH)
                || (! password.equals(repeatPassword))) {
            throw new PasswordValidationException(ERROR_WRONG);
        }
    }
}
