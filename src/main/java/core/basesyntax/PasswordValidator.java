package core.basesyntax;

public class PasswordValidator {
    private static final int PASS_LENGTH = 10;

    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if ((password == null || repeatPassword == null)
                || (password.length() < PASS_LENGTH || repeatPassword.length() < PASS_LENGTH)
                || !password.equals(repeatPassword)) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
