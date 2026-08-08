package core.basesyntax;

public class PasswordValidator {
    public static final int MIN_LENGTH = 10;

    public void validate(
            String password, String repeatPassword
    ) throws PasswordValidationException {
        if (password == null || repeatPassword == null) {
            throw new PasswordValidationException("Password must contain at least 10 characters");
        }
        if (!password.equals(repeatPassword)) {
            throw new PasswordValidationException("Wrong passwords");
        }
        if ((password.length() < MIN_LENGTH)) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
