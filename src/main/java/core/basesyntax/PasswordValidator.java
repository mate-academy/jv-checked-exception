package core.basesyntax;
import core.basesyntax.PasswordValidationException;

public class PasswordValidator {
    private static final String EXCEPTION_MESSAGE = "Wrong passwords";
    private static final int MIN_PASSWORD_LENGTH = 10;

    public void validate(String password, String repeatPassword) throws PasswordValidationException {
        if (password == null || repeatPassword == null ||
                                password.length() < MIN_PASSWORD_LENGTH ||
                                repeatPassword.length() < MIN_PASSWORD_LENGTH ||
                                !password.equals(repeatPassword)) {
            throw new PasswordValidationException(EXCEPTION_MESSAGE);
        }
    }
}
