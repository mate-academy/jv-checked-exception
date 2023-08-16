package core.basesyntax;

public class PasswordValidator {
    private static final int MIN_PASS_LENGTH = 9;

    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (password == null
                || password.length() <= MIN_PASS_LENGTH
                || !password.equals(repeatPassword)) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
