package core.basesyntax;

public class PasswordValidator {
    private static final String ERROR_MESSAGE = "Wrong passwords";

    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        //write your code here
        if (password == null || password.length() < 10 || !password.equals(repeatPassword)) {
            throw new PasswordValidationException(ERROR_MESSAGE);
        }
    }
}
