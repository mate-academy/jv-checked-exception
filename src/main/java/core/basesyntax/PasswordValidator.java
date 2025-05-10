package core.basesyntax;

public class PasswordValidator {
    public boolean validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if ((password != null && repeatPassword != null) && (password.length() >= 10)
                && (password.equals(repeatPassword))) {
            return true;
        } else {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
