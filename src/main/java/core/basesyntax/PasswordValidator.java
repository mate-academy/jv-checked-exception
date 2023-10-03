package core.basesyntax;

public class PasswordValidator {
    private static final int MINIMUM_PASSWORD_LENGTH = 10;

    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        try {
            if (password.length() < MINIMUM_PASSWORD_LENGTH
                    || repeatPassword.length() < MINIMUM_PASSWORD_LENGTH
                    || !password.equals(repeatPassword)) {
                throw new PasswordValidationException("Wrong passwords");
            }
        } catch (NullPointerException e) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
