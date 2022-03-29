package core.basesyntax;

public class PasswordValidator {
    private static final int PASSWORD_LOWER_BOUND = 10;

    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (password == null || repeatPassword == null
                || password.length() < PASSWORD_LOWER_BOUND
                || repeatPassword.length() < PASSWORD_LOWER_BOUND
                || !(password.equals(repeatPassword))) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
