package core.basesyntax;

public class PasswordValidator {
    public static void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (password.equals(repeatPassword)) {
            if (password.length() >= 10) {
                return;
            }
            throw new PasswordValidationException("Wrong passwords");
        }
        throw new PasswordValidationException("Wrong passwords");
    }
}
