package core.basesyntax;

public class PasswordValidator {
    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (password == null || !password.equals(repeatPassword)
                || password.length() < Constants.MIN_PASSWORD_LENGTH) {
            throw new PasswordValidationException(Constants.WRONG_PASSWORD_MESSAGE_VALIDATOR);
        }
    }
}
