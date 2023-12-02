package core.basesyntax;

public class PasswordValidator {
    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (password == null || repeatPassword == null) {
            throw new PasswordValidationException("Passwords cannot be null.");
        }
        if (!password.equals(repeatPassword)) {
            throw new PasswordValidationException("Wrong passwords");
        }

        if (password.length() < 8) {
            throw new PasswordValidationException("Your passwords are incorrect. Try again.");
        }

        if (!password.matches(".*\\d.*")) {
            throw new PasswordValidationException("Password should contain at least one digit.");
        }
    }
}

