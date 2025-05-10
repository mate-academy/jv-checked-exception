package core.basesyntax;

public class PasswordValidator {
    private static final int MIN_LENGTH_PASSWORD = 10;

    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (password == null || repeatPassword == null
                || password.isEmpty() || repeatPassword.isEmpty()
                || !password.equals(repeatPassword)
                || password.length() < MIN_LENGTH_PASSWORD) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
