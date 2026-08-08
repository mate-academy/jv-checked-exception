package core.basesyntax;

public class PasswordValidator {
    private static final int MIN_PASSWORD_LENGTH = 9;

    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (password == null || repeatPassword == null
                || password.equals(repeatPassword) == false
                || password.length() <= MIN_PASSWORD_LENGTH
                || repeatPassword.length() <= MIN_PASSWORD_LENGTH
                || password.length() != repeatPassword.length()) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}

