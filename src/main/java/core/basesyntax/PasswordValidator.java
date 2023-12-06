package core.basesyntax;

public class PasswordValidator {
    private static final int passwordMinLength = 10;
    public void validate (String password, String repeatPassword) throws PasswordValidationException {
        if (password == "" || repeatPassword == "") {
            throw new PasswordValidationException("Type password");
        }
        if (password == null || repeatPassword == null) {
            throw new PasswordValidationException("Type password");
        }
        if (password.length() < passwordMinLength) {
            throw new PasswordValidationException("Wrong passwords");
        }
        if (!password.equals(repeatPassword)) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}

