package core.basesyntax;

public class PasswordValidator {
    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (password == null || password.length() < 10) {
            throw new PasswordValidationException("Wrong passwords");
        }

        if (!password.equals(repeatPassword)) {
            throw new PasswordValidationException("Wrong password");
        }
    }
}

