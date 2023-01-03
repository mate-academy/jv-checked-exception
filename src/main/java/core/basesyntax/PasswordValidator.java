package core.basesyntax;

public class PasswordValidator {
    private static final String EXCEPTION_MESSAGE = "Wrong passwords";

    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (password == null || !password.equals(repeatPassword) || password.length() < 10) {
            throw new PasswordValidationException(EXCEPTION_MESSAGE);
        }
    }
}
