package core.basesyntax;

public class PasswordValidator {
    private static final int MIN_LENGTH = 10;

    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (password == null || password.isEmpty()) {
            throw new PasswordValidationException("Wrong passwords");
        } else if (!password.equals(repeatPassword) || repeatPassword.length() < MIN_LENGTH) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
