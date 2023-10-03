package core.basesyntax;

public class PasswordValidator {
    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (password == null || repeatPassword == null) {
            throw new PasswordValidationException("Password is null");
        }
        if (!password.equals(repeatPassword)) {
            throw new PasswordValidationException("Wrong passwords");
        }
        if (password.length() < 10) {
            throw new PasswordValidationException("Password's length is less than 10");
        }
        if (password.equals("")) {
            throw new PasswordValidationException("Empty password");
        }
    }
}
