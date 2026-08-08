package core.basesyntax;

public class PasswordValidator {
    public static final int MINIMUM_PASSWORD_CHARACTER = 10;

    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (password == null || password.length() < MINIMUM_PASSWORD_CHARACTER
                || !password.equals(repeatPassword)) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
