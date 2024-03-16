package core.basesyntax;

public class PasswordValidator {
    private static final int MINIMUM_PASSWORD_LENGTH = 10;

    public void validate(String password, String repeatPassword) throws PasswordValidationException {
        if (!password.equals(repeatPassword)) {
            throw new PasswordValidationException("Wrong passwords");
        }
        if (password.length() < MINIMUM_PASSWORD_LENGTH) {
            throw new PasswordValidationException("Password length is less than 10");
        }
    }
}
