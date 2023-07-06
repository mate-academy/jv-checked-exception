package core.basesyntax;

public class PasswordValidator {
    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (password == null || password.isEmpty()) {
            throw new PasswordValidationException("Password shouldn't be empty");
        } else if (repeatPassword == null || repeatPassword.isEmpty()) {
            throw new PasswordValidationException("Repeat Password shouldn't be empty");
        } else if (password.length() < 10 || !password.equals(repeatPassword)) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
