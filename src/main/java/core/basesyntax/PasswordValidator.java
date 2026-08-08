package core.basesyntax;

public class PasswordValidator {
    public static final int PASSWORD_LENGTH = 10;

    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (password == null || password.length() < PASSWORD_LENGTH) {
            throw new PasswordValidationException("Wrong passwords");
        }
        if (password.equals(repeatPassword)) {
            return;
        } else {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
