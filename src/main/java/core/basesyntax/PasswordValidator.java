package core.basesyntax;

public class PasswordValidator {
    public static boolean validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (repeatPassword != null && repeatPassword.equals(password) && password.length() >= 10) {
            return true;
        }
        throw new PasswordValidationException("Wrong passwords");
    }
}
