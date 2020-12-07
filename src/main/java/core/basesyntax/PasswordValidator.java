package core.basesyntax;

public class PasswordValidator {
    public boolean validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (password == null || repeatPassword == null) {
            throw new PasswordValidationException("Wrong passwords");
        }
        final int rightLengthPassword = 10;
        if (password.equals(repeatPassword) && password.length() >= rightLengthPassword) {
            return true;
        }
        throw new PasswordValidationException("Wrong passwords");
    }
}
