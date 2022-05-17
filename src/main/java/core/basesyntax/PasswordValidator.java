package core.basesyntax;

public class PasswordValidator {
    private static final int PASSWORD_LENGTH = 10;
    private static final String MESSAGE = "Wrong passwords";
    public void validate(String password, String repeatPassword) throws PasswordValidationException {
        if (password == null || repeatPassword == null || !password.equals(repeatPassword)
                || password.length() < PASSWORD_LENGTH) {
            throw new PasswordValidationException(MESSAGE);
        }
    }
}
