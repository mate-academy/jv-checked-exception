package core.basesyntax;

public class PasswordValidator {
    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (password == null || repeatPassword == null) {
            throw new PasswordValidationException("Password cannot be null.");
        }
        if (password.length() < 10 && repeatPassword.length() < 10) {
            throw new PasswordValidationException("Password must contain more than 9 characters.");
        }
        if (!password.equals(repeatPassword)) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
