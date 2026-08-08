package core.basesyntax;

public class PasswordValidator {
    private static final int MINIMAL_LENGTH_OF_PASSWORD = 10;

    public void validate(String password, String repeatPassword) throws
            PasswordValidationException {
        if (password == null && repeatPassword == null) {
            throw new PasswordValidationException("Wrong passwords");
        } else if (password.length() < MINIMAL_LENGTH_OF_PASSWORD
                && repeatPassword.length() < MINIMAL_LENGTH_OF_PASSWORD) {
            throw new PasswordValidationException("Your passwords are incorrect. Try again.");
        } else if (!password.equals(repeatPassword)) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
