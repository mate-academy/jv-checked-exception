package core.basesyntax;

public class PasswordValidator {
    private static final int MIN_PASSWORD_LENGTH = 10;

    public void validate(
            String password, String repeatPassword
    ) throws PasswordValidationException {
        if (password == null
                || repeatPassword == null
                || !this.validatePasswordLength(password)
                || !this.validatePasswordLength(repeatPassword)
                || !password.equals(repeatPassword)
        ) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }

    private boolean validatePasswordLength(String password) {
        return password.length() >= MIN_PASSWORD_LENGTH;
    }
}
