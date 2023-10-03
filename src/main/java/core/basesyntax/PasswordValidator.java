package core.basesyntax;

public class PasswordValidator {
    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (password == null) {
            throw new PasswordValidationException("Your passwords are incorrect. Try again.");
        } else if (!(password.equals(repeatPassword))) {
            throw new PasswordValidationException("Wrong passwords");
        } else if (password.length() < 10) {
            throw new PasswordValidationException("Your passwords are incorrect. Try again.");
        }
    }
}
