package core.basesyntax;

public class PasswordValidator {
    private static final int MIN_PASSWORD_LENGTH = 10;

    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        try {
            if (!(password.equals(repeatPassword)) || password.length() < MIN_PASSWORD_LENGTH) {
                throw new PasswordValidationException("Wrong passwords");
            }
        } catch (NullPointerException e) {
            throw new PasswordValidationException("Wrong passwords");
        }

    }
}
