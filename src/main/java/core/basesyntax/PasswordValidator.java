package core.basesyntax;

public class PasswordValidator {
    public static boolean validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (repeatPassword != null && repeatPassword.equals(password)) {
            if (password.length() < 10) {
                throw new PasswordValidationException("Wrong passwords");
            } else {
                return true;
            }
        } else {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
