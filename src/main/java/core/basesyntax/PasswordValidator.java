package core.basesyntax;

public class PasswordValidator {
    private static final int MAX_LENGTH_OF_PASSWORD = 10;

    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        try {
            if (password.length() < MAX_LENGTH_OF_PASSWORD || !password.equals(repeatPassword)) {
                throw new PasswordValidationException("Wrong passwords");
            }
        } catch (NullPointerException e) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
