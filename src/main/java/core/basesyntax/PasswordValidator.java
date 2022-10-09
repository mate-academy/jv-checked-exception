package core.basesyntax;

public class PasswordValidator {
    private static final int PASS_LENGTH = 10;

    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (password == null || password.isEmpty()
                || repeatPassword == null || repeatPassword.isEmpty()
                || (password.length() < PASS_LENGTH && repeatPassword.length() < PASS_LENGTH)) {
            throw new PasswordValidationException("Wrong passwords");
        }
        // this if-block I need to check, is passwords equals or not
        if (!password.equals(repeatPassword)) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
