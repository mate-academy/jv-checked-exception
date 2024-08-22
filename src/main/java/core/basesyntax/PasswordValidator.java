package core.basesyntax;

public class PasswordValidator {
    public static final int NORMAL_PASSWORD_LENGTH = 10;

    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (password != null && password.length() >= NORMAL_PASSWORD_LENGTH
                && password.equals(repeatPassword)) {
            return;
        }
        throw new PasswordValidationException("Wrong passwords");
    }
}
