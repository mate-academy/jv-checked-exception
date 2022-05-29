package core.basesyntax;

public class PasswordValidator {
    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (password == null || repeatPassword == null
                || password.length() < 10 || repeatPassword.length() < 10) {
            throw new PasswordValidationException("Wrong passwords");
        } else if (!repeatPassword.equals(password)) {
            throw new PasswordValidationException("Your passwords are incorrect. Try again.");
        }

    }
}
