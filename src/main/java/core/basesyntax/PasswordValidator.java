package core.basesyntax;

public class PasswordValidator {
    public static final int MIN_REQUARED_PASSWORD_LENGTH = 10;

    public void validate(String password, String repeatPassword) throws PasswordValidationException {
        if (password.length() < MIN_REQUARED_PASSWORD_LENGTH
                || repeatPassword.length() < MIN_REQUARED_PASSWORD_LENGTH
                || !password.equals(repeatPassword)) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
