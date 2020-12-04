package core.basesyntax;

public class PasswordValidator {
    public boolean validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (password != null && password.length() >= 10 && password.equals(repeatPassword)) {
            return true;
        }
        throw new PasswordValidationException("Wrong passwords");
    }
}
