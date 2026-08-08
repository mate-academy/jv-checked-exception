package core.basesyntax;

public class PasswordValidator {
    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (password == null || repeatPassword == null) {
            throw new PasswordValidationException("Password field is empty!");
        }
        if (password.equals(repeatPassword) && password.length() >= 10) {
            return;
        }
        throw new PasswordValidationException("Wrong passwords");
    }
}
