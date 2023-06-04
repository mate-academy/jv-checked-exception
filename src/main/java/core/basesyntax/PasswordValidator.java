package core.basesyntax;

public class PasswordValidator {
    private static final int CONSTANT_LENGTH_PASSWORD = 10;

    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (password == null || password.length()
                 < CONSTANT_LENGTH_PASSWORD
                 || !password.equals(repeatPassword)) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
