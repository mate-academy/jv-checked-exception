package core.basesyntax;

public class PasswordValidator {
    private static final int LENGTH = 10;

    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (password == null || !password.equals(repeatPassword) || password.length() < LENGTH) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
