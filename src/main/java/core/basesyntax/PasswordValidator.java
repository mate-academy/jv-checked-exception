package core.basesyntax;

public class PasswordValidator {
    private static final int PASSWORD_LENGTH = 10;

    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (password == null || password != repeatPassword
                || (password.length() < PASSWORD_LENGTH)) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
