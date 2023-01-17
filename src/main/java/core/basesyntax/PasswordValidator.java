package core.basesyntax;

public class PasswordValidator {
    private static final int MAX_LENGTH_OF_PASSWORD = 10;

    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (password == null || password.length() < MAX_LENGTH_OF_PASSWORD
                || password != repeatPassword) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
