package core.basesyntax;

public class PasswordValidator {
    private static final int MIN_LEN_PASSWORD = 10;

    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (password == null || repeatPassword == null || !password.equals(repeatPassword)
                || password.length() < MIN_LEN_PASSWORD) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
