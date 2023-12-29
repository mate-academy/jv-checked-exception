package core.basesyntax;

public class PasswordValidator {
    private static String MESSAGE = "Wrong passwords";

    public boolean validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (password == null || repeatPassword == null) {
            throw new PasswordValidationException(MESSAGE);
        }
        if (!password.equals(repeatPassword)) {
            throw new PasswordValidationException(MESSAGE);
        }
        if (password.length() >= 10 && repeatPassword.length() >= 10) {
            return true;
        } else {
            throw new PasswordValidationException(MESSAGE);
        }
    }
}

