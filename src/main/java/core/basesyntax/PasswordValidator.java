package core.basesyntax;

public class PasswordValidator {
    public boolean validate (String password, String repeatPassword) throws PasswordValidationException {
        if (password.length() < 10) {
            throw new PasswordValidationException("Wrong passwords");
        }

        if (password.equals(repeatPassword)) {
            throw new PasswordValidationException("Wrong passwords");
        }
        return true;
    }
}
