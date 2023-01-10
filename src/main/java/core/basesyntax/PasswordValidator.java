package core.basesyntax;

public class PasswordValidator {
    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (password.equals(repeatPassword) || password.length() <= 10 ||
                repeatPassword.length() <= 10) {
        } else {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
