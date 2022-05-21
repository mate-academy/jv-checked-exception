package core.basesyntax;

public class PasswordValidator {
    public static final String MESSAGE = "Wrong passwords";

    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (password == null || repeatPassword == null) {
            throw new PasswordValidationException(MESSAGE);
        }
        if (password.equals(repeatPassword)) {
            if (password.length() < 10) {
                throw new PasswordValidationException(MESSAGE);
            }
        } else {
            throw new PasswordValidationException(MESSAGE);
        }
    }
}
