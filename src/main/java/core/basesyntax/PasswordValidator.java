package core.basesyntax;

public class PasswordValidator {
    public static final int MIN_PASSWORD_LENGTH = 10;

    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (password != null
                && password.equals(repeatPassword)
                && password.length() >= MIN_PASSWORD_LENGTH) {
            return;
        }
        throw new PasswordValidationException("Wrong passwords");
    }
}
