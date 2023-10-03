package core.basesyntax;

public class PasswordValidator {
    private static final int MINIMAL_LENGTH = 10;

    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (password == null || repeatPassword == null
                || !repeatPassword.equals(password) || repeatPassword.length() < MINIMAL_LENGTH) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
