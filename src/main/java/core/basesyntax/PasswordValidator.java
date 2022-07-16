package core.basesyntax;

public class PasswordValidator {
    static final int NEEDED_PASS_LENGTH = 10;

    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (password == null || repeatPassword == null
                || password.length() < NEEDED_PASS_LENGTH
                || repeatPassword.length() < NEEDED_PASS_LENGTH
                || !password.equals(repeatPassword)) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
