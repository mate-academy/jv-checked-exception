package core.basesyntax;

public class PasswordValidator {
    static final int MAX_LENGTH = 10;

    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (password == null || !password.equals(repeatPassword)
                || password.length() < MAX_LENGTH) {

            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
