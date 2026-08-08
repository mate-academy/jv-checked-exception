package core.basesyntax;

public class PasswordValidator {
    private static final int PASSWORD_MIN_SIZE = 10;

    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (password == null || repeatPassword == null) {
            throw new PasswordValidationException("Wrong passwords");
        } else if (password.length() < PASSWORD_MIN_SIZE
                || repeatPassword.length() < PASSWORD_MIN_SIZE
                || !password.equals(repeatPassword)) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
