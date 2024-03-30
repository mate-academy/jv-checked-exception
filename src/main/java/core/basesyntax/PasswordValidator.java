package core.basesyntax;

public class PasswordValidator {
    public void validate(String password, String repeatPassword)
            throws PasswordValidationException, NullPointerException {
        if (password == null || repeatPassword == null) {
            throw new NullPointerException("Input data cannot be null");
        }
        if (password.length() >= 10 && repeatPassword.equals(password)) {
            return;
        }
        throw new PasswordValidationException("Wrong passwords");
    }
}
