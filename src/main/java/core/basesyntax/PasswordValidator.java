package core.basesyntax;

public class PasswordValidator {
    private static final int rightLengthPassword = 10;

    public boolean validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (password == null || repeatPassword == null) {
            throw new PasswordValidationException("Wrong passwords");
        }
        if (password.equals(repeatPassword) && password.length() >= rightLengthPassword) {
            return true;
        }
        throw new PasswordValidationException("Wrong passwords");
    }
}
