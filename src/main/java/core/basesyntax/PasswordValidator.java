package core.basesyntax;

public class PasswordValidator {
    private static final int LENGTH = 10;

    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (password != null && password.length() >= LENGTH && password.equals(repeatPassword)) {
            return;
        }
        throw new PasswordValidationException("Wrong passwords");
    }
}
