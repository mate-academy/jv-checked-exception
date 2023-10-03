package core.basesyntax;

public class PasswordValidator {
    private static final String EXCEPTION_MESSAGE = "Wrong passwords";

    public void validate(String password, String repeatPassword)
                throws PasswordValidationException {
        if (password == null || password.length() < 10 || !password.equals(repeatPassword)) {
            throw new PasswordValidationException(EXCEPTION_MESSAGE);
        }
    }
}
