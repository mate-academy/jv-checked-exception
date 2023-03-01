package core.basesyntax;

public class PasswordValidator {
    private static final int LIMIT = 10;

    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {

        if (password == null
                || password.length() < LIMIT
                || !password.equals(repeatPassword)) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
