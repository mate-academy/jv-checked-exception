package core.basesyntax;

public class PasswordValidator {
    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (!repeatPassword.equals(password)
                || password.length() < 10
                || repeatPassword.length() < 10) {
            throw new PasswordValidationException("PasswordValidationException : Wrong password");
        }
    }
}
