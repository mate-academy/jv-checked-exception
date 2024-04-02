package core.basesyntax;

public class PasswordValidator {
    public static final int MIN_PASS_LENGTH = 10;
    public static final String EXCEPTION_MESSAGE = "Wrong passwords";

    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (password == null || repeatPassword == null
                || !password.equals(repeatPassword) || password.length() < MIN_PASS_LENGTH) {
            throw new PasswordValidationException(EXCEPTION_MESSAGE);
        }
    }
}
