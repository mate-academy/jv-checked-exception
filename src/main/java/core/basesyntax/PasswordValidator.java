package core.basesyntax;

public class PasswordValidator {
    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        try {
            if (password.equals("")) {
                throw new PasswordValidationException("Input data is not correct");
            } else if (!password.equals(repeatPassword)) {
                throw new PasswordValidationException("Wrong passwords");
            } else if (password.length() < 10) {
                throw new PasswordValidationException("Wrong passwords");
            }
        } catch (PasswordValidationException e) {
            throw new PasswordValidationException("Your passwords are incorrect. Try again.");
        }
    }
}
