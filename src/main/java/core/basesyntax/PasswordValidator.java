package core.basesyntax;

public class PasswordValidator {
    public static boolean validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (password == null || repeatPassword == null) {
            throw new PasswordValidationException("Wrong passwords");
        } else if (password.equals(repeatPassword) && password.length() >= 10) {
            return true;
        }
        throw new PasswordValidationException("Wrong passwords");
    }
}
