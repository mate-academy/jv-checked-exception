package core.basesyntax;

public class PasswordValidator {
    private static final byte MIN_PASSWORD_LENGTH = 10;

    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (
                (password != null && repeatPassword != null)
                && (password.length() >= MIN_PASSWORD_LENGTH)
                && (repeatPassword.length() >= MIN_PASSWORD_LENGTH)
                && (password.equals(repeatPassword))
        ) {
            return;
        }

        throw new PasswordValidationException("Wrong passwords");
    }
}
