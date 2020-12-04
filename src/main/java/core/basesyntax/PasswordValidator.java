package core.basesyntax;

public class PasswordValidator {
    public boolean validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (password == null || repeatPassword == null
                || password.isEmpty() || repeatPassword.isEmpty()) {
            throw new PasswordValidationException("Wrong passwords");
        }
        int riteLengthPassword = 10;
        if (password.equals(repeatPassword) && password.length() >= riteLengthPassword) {
            return true;
        }
        throw new PasswordValidationException("Wrong passwords");
    }
}
