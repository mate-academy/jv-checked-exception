package core.basesyntax;

public class PasswordValidator {
    public boolean validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (password == null || repeatPassword == null) {
            throw new PasswordValidationException();
        }
        if (password.equals(repeatPassword)) {
            if (password.length() < 10) {
                throw new PasswordValidationException();
            }
            return true;
        } else {
            throw new PasswordValidationException("Wrong passwords");
        }

    }
}
