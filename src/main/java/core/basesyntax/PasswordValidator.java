package core.basesyntax;

public class PasswordValidator {
    private static final int MIN_LENGTH = 9;

    public static boolean validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (password != null && password.equals(repeatPassword)
                && password.length() > MIN_LENGTH) {
            return true;
        }
        throw new PasswordValidationException("Wrong passwords");
    }
}
