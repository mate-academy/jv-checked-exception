package core.basesyntax;

public class PasswordValidator {
    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (password == null
                || repeatPassword == null
                || password.length() < 10
                || repeatPassword.length() < 10
                || password.compareTo(repeatPassword) != 0) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
