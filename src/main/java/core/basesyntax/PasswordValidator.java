package core.basesyntax;

public class PasswordValidator {
    private static final String EXCEPTION_MESSAGE = "Wrong passwords";
    private static final int PASSWORD_LENGTH = 10;

    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        try {
            if (password.equals(repeatPassword) && password.length() >= PASSWORD_LENGTH) {
                return;
            }
            throw new PasswordValidationException(EXCEPTION_MESSAGE);
        } catch (NullPointerException e) {
            throw new PasswordValidationException(EXCEPTION_MESSAGE);
        }
    }
}
