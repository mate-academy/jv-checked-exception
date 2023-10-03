package core.basesyntax;

public class PasswordValidator {
    public static final int MIN_LENGTH_PASSWPRD = 10;

    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (password == null || !password.equals(repeatPassword)
                || password.length() < MIN_LENGTH_PASSWPRD) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
