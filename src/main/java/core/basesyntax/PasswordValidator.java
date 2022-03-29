package core.basesyntax;

public class PasswordValidator {
    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (password != null && repeatPassword != null
                && password.equals(repeatPassword)
                && password.length() >= 10) {
            return;
        }
        throw new PasswordValidationException("Wrong passwords");
    }
}
