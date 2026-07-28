package core.basesyntax;

public class PasswordValidator {
    private static final int MIN_LENGTH = 10;

    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (password == null || repeatPassword == null) {
            throw new PasswordValidationException("Wrong passwords");
        }
        if (password.isEmpty() || repeatPassword.isEmpty()) {
            throw new PasswordValidationException("Wrong passwords");
        }
        if (!password.equals(repeatPassword)) {
            throw new PasswordValidationException("Wrong passwords");
        }
        if (password.length() < MIN_LENGTH) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
