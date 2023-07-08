package core.basesyntax;

public class PasswordValidator {
    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (password == null || password.isEmpty()) {
            throw new PasswordValidationException("Wrong password");
        } else if (password.length() < 10 && repeatPassword.length() < 10) {
            throw new PasswordValidationException("Wrong password");
        } else if (!password.equals(repeatPassword)) {
            throw new PasswordValidationException("Wrong passwords");
        }

    }
}
