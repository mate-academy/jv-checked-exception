package core.basesyntax;

public class PasswordValidator {
    private static final int PASSWORD_MIN_LENGTH = 10;

    public boolean validate(String password, String repeatPassword) throws
            PasswordValidationException {
        if (password == null || repeatPassword == null) {
            throw new PasswordValidationException("Password or repeatPassword cannot be null");
        }

        if (!password.equals(repeatPassword)) {
            throw new PasswordValidationException("Wrong passwords");
        }

        if (password.length() < PASSWORD_MIN_LENGTH) {
            throw new PasswordValidationException("Password is too short");
        }

        return true;
    }
}
