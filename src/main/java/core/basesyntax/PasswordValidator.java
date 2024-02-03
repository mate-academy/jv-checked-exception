package core.basesyntax;

public class PasswordValidator {
    private static final int VALID_PASSWORD_LENGTH = 10;

    public void validate(String password, String repeatPassword) throws PasswordValidationException {
        if ((password.length() < VALID_PASSWORD_LENGTH) && (password.length() != repeatPassword.length())) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
