package core.basesyntax;

public class PasswordValidator {
    public boolean validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (password == null || repeatPassword == null) {
            throw new PasswordValidationException();
        }
        if (repeatPassword.equals(password) && password.length() >= 10) {
            return true;
        }
        throw new PasswordValidationException();
    }
}
