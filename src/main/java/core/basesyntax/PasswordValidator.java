package core.basesyntax;

public class PasswordValidator {
    public static void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (password == null || repeatPassword == null) {
            throw new PasswordValidationException("Passwords cannot be null");
        }
        if (repeatPassword.length() < 10 || password.length() < 10
               || !repeatPassword.equals(password)) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
