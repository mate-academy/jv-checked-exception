package core.basesyntax;

public class PasswordValidator {
    public boolean validate(String password, String repeatPassword)
            throws PasswordValidationException {

        if (password == null || !password.equals(repeatPassword)) {
            throw new PasswordValidationException("Wrong passwords");
        }

        if (repeatPassword.length() < 10) {
            throw new PasswordValidationException("Your passwords are incorrect. Try again.");
        }

        return true;
    }
}
