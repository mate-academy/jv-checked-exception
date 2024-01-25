package core.basesyntax;

public class PasswordValidator {
    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (password == null || repeatPassword == null) {
            throw new PasswordValidationException("Wrong passwords");
        }
        if (!password.equals(repeatPassword) || !isLength(password) || !isLength(repeatPassword)) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }

    public boolean isLength(String password) {
        if (password.length() >= 10) {
            return true;
        }
        return false;
    }
}
