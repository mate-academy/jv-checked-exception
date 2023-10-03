package core.basesyntax;

public class PasswordValidator {
    static final int MAX_LENGTH_PASSWORD = 10;

    public void validate(String password, String repeatPassword)
                throws PasswordValidationException {
        if (password == null || repeatPassword == null) {
            throw new PasswordValidationException("Wrong passwords");
        }
        if (password.isEmpty() || repeatPassword.isEmpty() || !password.equals(repeatPassword)) {
            throw new PasswordValidationException("Wrong passwords");
        }
        if (password.length() < MAX_LENGTH_PASSWORD
                    || repeatPassword.length() < MAX_LENGTH_PASSWORD) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}


