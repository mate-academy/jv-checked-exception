package core.basesyntax;

public class PasswordValidator {
    public static final String WRONG_PASSWORDS_MESSAGE = "Wrong passwords";
    public static final int MIN_PASSWORD_LENGTH = 10;

    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (!isValid(password, repeatPassword)) {
            throw new PasswordValidationException(WRONG_PASSWORDS_MESSAGE);
        }
    }

    private boolean isValid(String password, String repeatPassword) {
        return password != null
                && password.length() >= MIN_PASSWORD_LENGTH
                && password.equals(repeatPassword);
    }
}
