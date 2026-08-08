package core.basesyntax;

public class PasswordValidator {
    private static final int MIN_PASSWORD_LENGTH = 10;
    private static final String WRONG_PASSWORD_MESSAGE =
            "Wrong passwords";

    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (password == null
                || repeatPassword == null
                || !password.equals(repeatPassword)
                || password.length() < MIN_PASSWORD_LENGTH) {
            throw new PasswordValidationException(WRONG_PASSWORD_MESSAGE);
        }
    }
}
