package core.basesyntax;

public class PasswordValidator {
    public static final int MINIMUM_PASSWORD_LENGTH = 10;

    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if ((password == null || repeatPassword == null)
                || !(password.equals(repeatPassword))
                || password.length() < MINIMUM_PASSWORD_LENGTH
                || repeatPassword.length() < MINIMUM_PASSWORD_LENGTH) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
