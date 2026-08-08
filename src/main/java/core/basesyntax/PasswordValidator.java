package core.basesyntax;

public class PasswordValidator {
    private static final String WRONG_PASSWORD_TEXT = "Wrong passwords";

    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (password == null
                || repeatPassword == null
                || !password.equals(repeatPassword)
                || password.length() < 10) {
            throw new PasswordValidationException(WRONG_PASSWORD_TEXT);
        }
    }
}
