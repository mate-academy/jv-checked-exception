package core.basesyntax;

public class PasswordValidator {
    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (password == null
                && repeatPassword == null
                || password.length() < 1
                || repeatPassword.length() < 1) {
            throw new PasswordValidationException("Empty field");
        }
        if (!(password.equals(repeatPassword)
                && password.length() >= 10
                && repeatPassword.length() >= 10)) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
