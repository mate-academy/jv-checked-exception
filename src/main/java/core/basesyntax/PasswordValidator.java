package core.basesyntax;

public class PasswordValidator {
    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        String err = "Wrong passwords";
        if (password == null || repeatPassword == null) {
            throw new PasswordValidationException(err);
        }
        if (!password.equals(repeatPassword)) {
            throw new PasswordValidationException(err);
        }
        if (password.length() < 10 || repeatPassword.length() < 10) {
            throw new PasswordValidationException(err);
        }
        if (password.trim().equals("")) {
            throw new PasswordValidationException(err);
        }
    }
}
