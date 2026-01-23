package core.basesyntax;

public class PasswordValidator {

    public static final double MIN_LEN = 10;

    public static void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        boolean isValid = (password != null
                && password.length() >= MIN_LEN
                && password.equals(repeatPassword));
        if (!isValid) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
