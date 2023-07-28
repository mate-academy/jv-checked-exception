package core.basesyntax;

public class PasswordValidator {
    public void validate(String password, String repeatPassword) throws PasswordValidationException {
        if (password == null || repeatPassword == null || password.isBlank()) {
            throw new PasswordValidationException("Wrong passwords");
        }
        if (password.length() < 10 || password.length() != repeatPassword.length()) {
            throw new PasswordValidationException("Wrong passwords");
        }
        if (!password.equals(repeatPassword)) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
