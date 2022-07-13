package core.basesyntax;

public class PasswordValidator {
    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (password != null
                && repeatPassword != null) {
            if (password.length() >= 10
                    && repeatPassword.length() >= 10
                    && password.equals(repeatPassword)) {
                return;
            }
        }

        throw new PasswordValidationException("Wrong passwords");
    }
}
