package core.basesyntax;

public class PasswordValidator {
    private static String chars = "\\\'\"@";

    public static void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (!(password.equals(repeatPassword) && password.length() >= 10)
                || password == null) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
