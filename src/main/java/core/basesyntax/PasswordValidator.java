package core.basesyntax;

public class PasswordValidator {
    public static final String WRONG_PASSWORDS = "Wrong passwords";

    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (password == null || !password.equals(repeatPassword) || password.length() < 10) {
            throw new PasswordValidationException(WRONG_PASSWORDS);
        }
    }
}
