package core.basesyntax;

public class PasswordValidator {
    public static final String ERROR_MESSAGE = "Wrong passwords";
    public static final int MIN_PASSWORD_LENGTH = 10;

    public void validate(String password, String repeatPassword) throws PasswordValidationException {
        //write your code here
        if (!repeatPassword.equals(password) || password.length() < MIN_PASSWORD_LENGTH) {
            throw new PasswordValidationException(ERROR_MESSAGE);
        }
    }
}
