package core.basesyntax;

public class PasswordValidator {
    public void validate(String password, String repeatPassword) throws PasswordValidationException {
        if ((password == null && repeatPassword == null)
                || (password.length() == 0 && repeatPassword.length() == 0)) {
            throw new PasswordValidationException("Wrong passwords");
        }
        if (!repeatPassword.equals(password) || password.length() < 10) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
