package core.basesyntax;

public class PasswordValidator {
    private static final int MIN_PASSWORD_SIZE = 10;

    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (password == null || repeatPassword == null
                || password.isEmpty() || repeatPassword.isEmpty()
                || password.length() < MIN_PASSWORD_SIZE || !password.equals(repeatPassword)) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
