package core.basesyntax;

public class PasswordValidator {
    public void validate(String password, String repeatPassword) throws PasswordValidationException {
        // Check for null or empty passwords
        if (password == null || password.isEmpty() || repeatPassword == null || repeatPassword.isEmpty()) {
            throw new PasswordValidationException("Password cannot be null or empty");
        }

        // Check if passwords match
        if (!password.equals(repeatPassword)) {
            throw new PasswordValidationException("Wrong passwords");
        }

        // Check for password strength
        if (password.length() <= 6) {
            throw new PasswordValidationException("Password is too short");
        }
    }
}