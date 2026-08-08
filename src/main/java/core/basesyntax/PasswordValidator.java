package core.basesyntax;

public class PasswordValidator {
    private static final int LENGTH_PASSWORD = 10;

    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (password == null || !password.equals(repeatPassword)
                || password.length() < LENGTH_PASSWORD) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}


