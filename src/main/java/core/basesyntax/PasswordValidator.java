package core.basesyntax;

public class PasswordValidator {
    public boolean validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (password != null
                && password.equals(repeatPassword) && password.length() >= 10) {
            return true;
        }
        throw new PasswordValidationException("Wrong passwords");
    }
}
