package core.basesyntax;

public class PasswordValidator {
    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {

        if (password == null || repeatPassword == null) {
            throw new PasswordValidationException("Password or repeatPassword should not be null");
        }

        if (!password.equals(repeatPassword)) {
            throw new PasswordValidationException("Wrong passwords");
        }

        if (password.length() < 10) {
            throw new PasswordValidationException("Password is too short. "
                   + "It must be at least 10 characters.");
        }

    }
}

