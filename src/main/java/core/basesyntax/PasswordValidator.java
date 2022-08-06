package core.basesyntax;

public class PasswordValidator {
    public final void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (password == repeatPassword
                && password != null
                && repeatPassword != null
                && password.length() >= 10
                && repeatPassword.length() >= 10) {
            return;
        } else {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
