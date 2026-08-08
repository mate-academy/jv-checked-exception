package core.basesyntax;

public class PasswordValidator {
    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (password == null || repeatPassword == null) {
            throw new PasswordValidationException("Wrong Password");
        }

        if (!password.equals(repeatPassword) || password.length() < 10
                || password.isBlank() || repeatPassword.isBlank()) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
