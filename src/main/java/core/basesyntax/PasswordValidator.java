package core.basesyntax;

public class PasswordValidator {
    public boolean validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if ((password != null) && (password.compareTo(repeatPassword) == 0)
                && (password.length() > 9)) {
            return true;
        }
        throw new PasswordValidationException("Wrong passwords");
    }
}
