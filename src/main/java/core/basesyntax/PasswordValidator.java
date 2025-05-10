package core.basesyntax;

public class PasswordValidator {
    private static final int MAX_LENGTH_PASSWORD = 10;

    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (password == null || repeatPassword == null || !password.equals(repeatPassword)
                || password.length() < MAX_LENGTH_PASSWORD) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
