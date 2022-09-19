package core.basesyntax;

public class PasswordValidator {
    public static final int PASSWORD_LENGTH = 10;

    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        try {
            if (password.equals(repeatPassword) == false
                    || password.length() < PASSWORD_LENGTH
                    || repeatPassword.length() < PASSWORD_LENGTH) {
                throw new PasswordValidationException("Wrong passwords");
            }
        } catch (NullPointerException e) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
