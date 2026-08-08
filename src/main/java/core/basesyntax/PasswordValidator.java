package core.basesyntax;

public class PasswordValidator {
    private static final String MESSAGE = "Wrong passwords";

    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (password == null && repeatPassword == null
                || password.length() < 10 && repeatPassword.length() < 10
                || !password.equals(repeatPassword)) {
            throw new PasswordValidationException(MESSAGE);
        }

    }
}
