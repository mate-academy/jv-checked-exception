package core.basesyntax;

public class PasswordValidator {
    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (password == null || !password.equals(repeatPassword) || repeatPassword.length() < 10) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
