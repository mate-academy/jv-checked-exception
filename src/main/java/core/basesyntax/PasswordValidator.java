package core.basesyntax;

public class PasswordValidator {
    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        String message = "Wrong passwords";
        if (password == null || repeatPassword == null) {
            throw new PasswordValidationException(message);
        }
        if (!password.equals(repeatPassword)) {
            throw new PasswordValidationException(message);
        }
        if (password.length() + repeatPassword.length() < 20) {
            throw new PasswordValidationException(message);
        }
    }
}
