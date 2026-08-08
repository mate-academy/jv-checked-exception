package core.basesyntax;

public class PasswordValidator {
    private static final int MIN_SIZE_PASS = 10;

    public void validate(String password, String repeatPassword) throws
            PasswordValidationException {
        if (password == null || password.length() < MIN_SIZE_PASS
                || !password.equals(repeatPassword)) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
