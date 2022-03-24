package core.basesyntax;

public class PasswordValidator {
    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (password.length() < 10
                || !password.equals(repeatPassword)
                || password.length() != 0) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
