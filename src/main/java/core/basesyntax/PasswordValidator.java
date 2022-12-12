package core.basesyntax;

public class PasswordValidator {
    private static final int PASSWORD_LENGTH_MINIMUM = 10;

    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (password == null || password.length()
                < PASSWORD_LENGTH_MINIMUM || repeatPassword.length()
                < PASSWORD_LENGTH_MINIMUM || !password.equals(repeatPassword)) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
