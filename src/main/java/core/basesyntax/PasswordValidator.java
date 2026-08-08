package core.basesyntax;

public class PasswordValidator {
    public static final String EXCEPTION_MESSAGE = "Wrong passwords";

    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {

        if ((password == null || repeatPassword == null)
                || !password.equals(repeatPassword)
                || password.length() < 10) {
            throw new PasswordValidationException(EXCEPTION_MESSAGE);
        }
    }
}
