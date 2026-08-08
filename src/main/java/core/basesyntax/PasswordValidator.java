package core.basesyntax;

public class PasswordValidator {
    private static final String WRONG_PASSWORDS = "Wrong passwords";

    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (repeatPassword == null || password == null) {
            throw new PasswordValidationException(WRONG_PASSWORDS);
        }
        if (!repeatPassword.equals(password)) {
            throw new PasswordValidationException(WRONG_PASSWORDS);
        }
        if (repeatPassword.length() < 10 || password.length() < 10) {
            throw new PasswordValidationException(WRONG_PASSWORDS);
        }
    }
}
