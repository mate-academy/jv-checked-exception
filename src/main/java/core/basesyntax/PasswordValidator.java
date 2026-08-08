package core.basesyntax;

public class PasswordValidator {
    public void validate(String password, String repeatPassword
    ) throws PasswordValidationException {
        if (password == null || repeatPassword == null) {
            throw new PasswordValidationException("Your passwords are incorrect. Try again.");
        }
        if (password.length() == 0) {
            throw new PasswordValidationException("Empty input");
        }
        if (!password.equals(repeatPassword)) {
            throw new PasswordValidationException("Wrong passwords");
        }

        if (password.length() < 10) {
            throw new PasswordValidationException("Password must be at least 10 characters long.");
        }
    }
}
