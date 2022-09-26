package core.basesyntax;

public class PasswordValidator {

    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (password != null) {
            if (password.equals(repeatPassword) && password.length() >= 10) {
                return;
            } else {
                throw new PasswordValidationException("Wrong passwords");
            }
        } else {
            throw new PasswordValidationException("Your passwords are incorrect. Try again.");
        }
    }
}
