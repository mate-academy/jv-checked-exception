package core.basesyntax;

public class PasswordValidator {
    public static final int MIN_PASSWORD_LENGTH = 10;

    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (password == null || repeatPassword == null) {
            throw new PasswordValidationException("Wrong passwords");
        }
        if (password.length() < MIN_PASSWORD_LENGTH || !repeatPassword.equals(password)) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
