package core.basesyntax;

public class PasswordValidator {
    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (password == null || repeatPassword == null) {
            throw new IllegalArgumentException("Password or repeatPassword equels null");
        }
        if (!password.equals(repeatPassword)
                || repeatPassword.length() < 10 || password.length() < 10) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}

