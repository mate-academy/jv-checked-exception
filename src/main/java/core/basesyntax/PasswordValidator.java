package core.basesyntax;

public class PasswordValidator {
    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        try {
            if (password.length() < 10 || repeatPassword.length() < 10) {
                throw new PasswordValidationException("Wrong passwords");
            } else if (password.length() == 0 || repeatPassword.length() == 0) {
                throw new PasswordValidationException("Wrong passwords");
            } else if (!password.equals(repeatPassword)) {
                throw new PasswordValidationException("Wrong passwords");
            }
        } catch (NullPointerException e) {
            throw new PasswordValidationException("Your passwords are incorrect. Try again.");
        }
    }
}
