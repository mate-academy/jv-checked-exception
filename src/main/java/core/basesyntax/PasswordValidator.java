package core.basesyntax;

public class PasswordValidator {
    private static final int MAX_LENGTH = 10;

    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (password == null || repeatPassword == null) {
            throw new RuntimeException();
        }
        if (!(password.equals(repeatPassword))) {
            throw new PasswordValidationException("Wrong passwords");
        }
        if (password.length() < MAX_LENGTH && repeatPassword.length() < MAX_LENGTH) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
