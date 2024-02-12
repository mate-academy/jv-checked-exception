package core.basesyntax;

public class PasswordValidator {
    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (password == null || repeatPassword == null || password.isEmpty()
                || repeatPassword.isEmpty()) {
            throw new PasswordValidationException("Password or repeatPassword is null");
        }
        if (!password.equals(repeatPassword)) {
            throw new PasswordValidationException("Wrong passwords");
        }
        if (password.length() < 10) {
            throw new PasswordValidationException("Password is too short");
        }
    }
}
