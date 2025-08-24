package core.basesyntax;

public class PasswordValidator {
    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (password == null || repeatPassword == null) {
            throw new PasswordValidationException("One or both passwords are missing");
        }

        if (password.length() < 10 || repeatPassword.length() < 10) {
            throw new PasswordValidationException("Wrong passwords");
        }

        String cookedPassword = password.trim();
        String cookedRepeatPassword = repeatPassword.trim();
        if (!cookedPassword.equals(cookedRepeatPassword)) {
            throw new PasswordValidationException("Passwords are not equal");
        }
    }
}
