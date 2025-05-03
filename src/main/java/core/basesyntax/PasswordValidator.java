package core.basesyntax;

public class PasswordValidator {
    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (password == null || repeatPassword == null) {
            throw new PasswordValidationException("Wrong passwords");
        }
        if (password.compareTo(repeatPassword) != 0
                || password.length() < 10) {
            throw new PasswordValidationException("Wrong passwords");
        }

    }
}
