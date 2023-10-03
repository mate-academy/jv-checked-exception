package core.basesyntax;

public class PasswordValidator {
    private static final int PASSWORD_MAX = 10;

    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (password == null) {
            throw new PasswordValidationException("Wrong passwords");
        } else if (!password.equals(repeatPassword) || (password.length() < PASSWORD_MAX)) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
