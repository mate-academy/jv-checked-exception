package core.basesyntax;

public class PasswordValidator {
    private static final String MESSAGE = "Wrong passwords";
    private static final int PASSWORD_LENGTH = 10;

    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (password == null || repeatPassword == null
                || password.length() < PASSWORD_LENGTH || repeatPassword.length() < PASSWORD_LENGTH
                || (!password.equals(repeatPassword))) {
            throw new PasswordValidationException(MESSAGE);
        }
    }
}

