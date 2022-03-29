package core.basesyntax;

public class PasswordValidator {
    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {

        if ((password != repeatPassword) && (password.length() >= 10)) {
            throw new PasswordValidationException("Your passwords are incorrect. Try again.");
        }
        if (password == null) {
            throw new PasswordValidationException("Your passwords are incorrect. Try again.");
        }
        if ((password.isEmpty() && repeatPassword.isEmpty())
                || ((password.length() <= 4) && (repeatPassword.length() <= 4))) {
            throw new PasswordValidationException("Your passwords are incorrect. Try again.");
        }

    }
}
