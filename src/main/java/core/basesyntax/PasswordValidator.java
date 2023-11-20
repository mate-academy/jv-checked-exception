package core.basesyntax;

public class PasswordValidator {
    public static final int MAX_PASSWORD_SIZE = 10;
    public static final String MESSAGE_WRONG_PASSWORDS = "Wrong passwords";

    public void validate(String password,
                         String repeatPassword) throws PasswordValidationException {
        if (password == null || repeatPassword == null) {
            throw new PasswordValidationException(MESSAGE_WRONG_PASSWORDS);
        }
        if (password.length() < MAX_PASSWORD_SIZE || repeatPassword.length() < MAX_PASSWORD_SIZE) {
            throw new PasswordValidationException(MESSAGE_WRONG_PASSWORDS);
        }
        if (!password.equals(repeatPassword)) {
            throw new PasswordValidationException(MESSAGE_WRONG_PASSWORDS);
        }
    }
}
