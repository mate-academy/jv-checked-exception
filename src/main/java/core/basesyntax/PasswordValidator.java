package core.basesyntax;

public class PasswordValidator {
    static final int CHECK_LENGTH = 10;

    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (password == null) {
            throw new PasswordValidationException("");
        }

        if (!password.equals(repeatPassword)) {
            throw new PasswordValidationException("Wrong passwords");
        }

        if (password.length() < CHECK_LENGTH) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
