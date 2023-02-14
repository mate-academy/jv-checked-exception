package core.basesyntax;

public class PasswordValidator {
    public static void validate(
            String password, String repeatPassword
    ) throws PasswordValidationException {
        if (password.length() < 10) {
            throw new PasswordValidationException("Wrong passwords");
        } else if (!(password.equals(repeatPassword))) {
            throw new PasswordValidationException("Wrong password");
        } else if (password == null) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
