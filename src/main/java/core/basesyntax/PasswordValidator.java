package core.basesyntax;

public class PasswordValidator {

    private static final int REQUIRED_PASSWORD_LENGTH = 10;
    private static final String WRONG_PASSWORD_MESSAGE = "Wrong passwords";

    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if ((password == null || repeatPassword == null)
                || (password.length() < REQUIRED_PASSWORD_LENGTH
                || repeatPassword.length() < REQUIRED_PASSWORD_LENGTH)
                || !password.equals(repeatPassword)) {
            throw new PasswordValidationException(WRONG_PASSWORD_MESSAGE);
        }
    }
}
