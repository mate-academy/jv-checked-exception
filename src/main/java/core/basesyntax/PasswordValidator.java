package core.basesyntax;

public class PasswordValidator {
    private static final String ERROR_MESSAGE = "Wrong passwords";
    private static final int MIN_LENGTH = 10;

    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {

        if (password == null
                || repeatPassword == null
                || password.length() < MIN_LENGTH
                || !password.equals(repeatPassword)) {
            throw new PasswordValidationException(ERROR_MESSAGE);
        }
    }
}
