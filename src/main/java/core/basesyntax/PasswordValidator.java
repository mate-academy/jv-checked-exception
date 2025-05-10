package core.basesyntax;

public class PasswordValidator {
    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        try {
            if (repeatPassword.equals(password) && password.length() >= 10) {
                System.out.println();
            } else {
                throw new PasswordValidationException("Wrong passwords");
            }
        } catch (NullPointerException e) {
            throw new PasswordValidationException("Your passwords are incorrect. Try again.");
        }
    }
}
