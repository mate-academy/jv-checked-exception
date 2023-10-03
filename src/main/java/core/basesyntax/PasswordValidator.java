package core.basesyntax;

public class PasswordValidator {
    private static final int MAX_SIZE = 10;

    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (password == null || !password.equals(repeatPassword) || password.length() < MAX_SIZE) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
