package core.basesyntax;

public class PasswordValidator {
    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        final int password_length = 10;
        final boolean password_not_valid = password.length() < password_length
                || repeatPassword.length() < password_length
                || !(password.equals(repeatPassword));

        if (password_not_valid) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
