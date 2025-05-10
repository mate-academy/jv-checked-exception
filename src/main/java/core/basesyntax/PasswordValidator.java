package core.basesyntax;

public class PasswordValidator {
    private static final short MAX_LENGTH = 10;

    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if ((password == null)
                || (password.length() < MAX_LENGTH)
                || !password.equals(repeatPassword)) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
