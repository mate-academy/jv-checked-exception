package core.basesyntax;

public class PasswordValidator {
    static final int PASSWORD_MIN_LENGTH = 10;

    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (password == null || repeatPassword == null) {
            throw new PasswordValidationException("Your passwords are incorrect. Try again.");
        }

        if (password.length() != repeatPassword.length()) {
            throw new PasswordValidationException("Wrong passwords");
        }

        if (password.length() < PASSWORD_MIN_LENGTH) {
            throw new PasswordValidationException("Your passwords are incorrect. Try again.");
        }

        if (!password.equals(repeatPassword)) {
            throw new PasswordValidationException("Passwords do not match");
        }
    }

}
