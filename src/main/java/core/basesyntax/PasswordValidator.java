package core.basesyntax;

public class PasswordValidator {

    static final int MIN_PASSWORD_LENGTH = 10;

    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {

        if (password == null || repeatPassword == null) {
            throw new PasswordValidationException("Wrong passwords");
        }

        if (password.length() != repeatPassword.length() || password.length() < MIN_PASSWORD_LENGTH
                || password != repeatPassword || password == null) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
