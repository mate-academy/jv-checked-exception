package core.basesyntax;

public class PasswordValidator {

    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        int minPasswordLength = 10;
        if (password != null &&
                password.equals(repeatPassword) &&
                password.length() >= minPasswordLength) {
            return;
        }
        throw new PasswordValidationException("Wrong passwords");
    }
}
