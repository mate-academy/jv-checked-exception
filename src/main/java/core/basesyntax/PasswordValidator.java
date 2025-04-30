package core.basesyntax;

public class PasswordValidator {
    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {

        if (password == null || repeatPassword == null
                || password.isEmpty() || repeatPassword.isEmpty()
                || !password.equals(repeatPassword)
                || password.length() < 10
                || password.equals(password.toLowerCase())
                || password.equals(password.toUpperCase())) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
