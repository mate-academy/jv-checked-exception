package core.basesyntax;

public class PasswordValidator {
    public boolean validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (password == null || repeatPassword == null) {
            throw new PasswordValidationException("Wrong passwords");
        } else if (password.equals(repeatPassword) && password.length() >= 10) {
            return true;
        } else {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
