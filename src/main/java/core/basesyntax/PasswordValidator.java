package core.basesyntax;

public class PasswordValidator {
    private static final int PASSWORD_LENGTH = 10;

    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        String message = "Wrong passwords";
        if (password == null || repeatPassword == null) {
            throw new PasswordValidationException(message);
        }
        if (password.length() < PASSWORD_LENGTH || repeatPassword.length() < PASSWORD_LENGTH) {
            throw new PasswordValidationException(message);
        }
        if (!password.equals(repeatPassword)) {
            throw new PasswordValidationException(message);
        }
    }
}
