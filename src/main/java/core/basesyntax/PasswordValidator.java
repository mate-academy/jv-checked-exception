package core.basesyntax;

public class PasswordValidator {
    private static final int REQUIRED_LENGTH_OF_PASSWORD = 10;

    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (password == null || repeatPassword == null || !password.equals(repeatPassword)
                || (password.length() < REQUIRED_LENGTH_OF_PASSWORD
                && repeatPassword.length() < REQUIRED_LENGTH_OF_PASSWORD)) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
