package core.basesyntax;

public class PasswordValidator {
    private static final int maxLength = 10;
    private static final PasswordValidationException pw =
            new PasswordValidationException("Wrong passwords");

    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if ((password.length() < maxLength) && (repeatPassword.length() < maxLength)) {
            throw pw;
        }
    }
}
