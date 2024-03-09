package core.basesyntax;

public class PasswordValidator {
    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (password == null || repeatPassword == null) {
            throw new PasswordValidationException("Password or repeatPassword can't be null");
        } else if (!password.equals(repeatPassword)
                || password.length() < 10) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
