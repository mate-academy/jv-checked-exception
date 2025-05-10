package core.basesyntax;

public class PasswordValidator {
    public static final int MIN_PASSWORD_LENGTH = 10;

    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (password == null || repeatPassword == null) {
            throw new PasswordValidationException("Password and/or repeat "
                    + "password cannot be null.");
        } else if (!password.equals(repeatPassword)) {
            throw new PasswordValidationException("Wrong passwords");
        } else if (password.length() < MIN_PASSWORD_LENGTH) {
            throw new PasswordValidationException("Your passwords are incorrect. Try again.");
        }

    }
}
