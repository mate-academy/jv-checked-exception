package core.basesyntax;

public class PasswordValidator {
    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (password == null && repeatPassword == null) {
            throw new PasswordValidationException("Wrong passwords");
        } else if (password.equals(repeatPassword)) {
            if (password.length() >= 10 && repeatPassword.length() >= 10) {
                return;
            } else {
                throw new PasswordValidationException("Wrong passwords");
            }
        } else {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
