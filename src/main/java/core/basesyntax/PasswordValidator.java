package core.basesyntax;

public class PasswordValidator extends Throwable {
    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (password == null || repeatPassword == null) {
            throw new PasswordValidationException("Your passwords are incorrect. Try again.");
        }
        if (!password.equals(repeatPassword)) {
            throw new PasswordValidationException("Wrong passwords");
        }
        if (password.length() < 10) {
            throw new PasswordValidationException("Your passwords are incorrect. Try again.");
        }

    }
}
