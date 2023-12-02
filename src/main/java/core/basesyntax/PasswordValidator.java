package core.basesyntax;

public class PasswordValidator {
    private static final int MIN_LONG = 10;

    public boolean validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (password == null && repeatPassword == null) {
            throw new PasswordValidationException("Wrong passwords");
        }
        if (password.equals(repeatPassword) && password.length() >= MIN_LONG) {
            return true;
        } else {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
