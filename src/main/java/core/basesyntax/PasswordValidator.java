package core.basesyntax;

public class PasswordValidator {
    private static final int CHECK_LENGTH = 10;

    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (password == null) {
            throw new PasswordValidationException("The password field is empty");
        }

        if (repeatPassword.length() < CHECK_LENGTH) {
            throw new PasswordValidationException("Password less than ten");
        }

        if (!password.equals(repeatPassword)) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
