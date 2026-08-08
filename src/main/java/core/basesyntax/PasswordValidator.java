package core.basesyntax;

public class PasswordValidator {
    private static final String ERROR_MESSAGE = "Wrong passwords";

    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (((password == null && repeatPassword == null) || password.length() == 0)
                || (password.equals(repeatPassword) && password.length() < 10)
                || !password.equals(repeatPassword)) {
            throw new PasswordValidationException(ERROR_MESSAGE);
        }
    }
}
