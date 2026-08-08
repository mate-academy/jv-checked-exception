package core.basesyntax;

public class PasswordValidator {
    private static final int MINIMUM_DIGITS_QUANTITY = 10;

    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (password == null
                || repeatPassword == null
                || !password.equals(repeatPassword)
                || password.length() != repeatPassword.length()
                || password.length() < MINIMUM_DIGITS_QUANTITY) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
