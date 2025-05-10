package core.basesyntax;

public class PasswordValidator {
    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {

        if (password == null || repeatPassword == null) {
            throw new PasswordValidationException("Wrong passwords");
        }

        if (password.length() == 0 || repeatPassword.length() == 0) {
            throw new PasswordValidationException("Wrong passwords");
        }

        if (password.length() < 10
                || repeatPassword.length() < 10
                || !(password.equals(repeatPassword))) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
