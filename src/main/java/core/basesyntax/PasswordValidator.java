package core.basesyntax;

public class PasswordValidator {

    private static final String MESSAGE = "Your passwords are incorrect. Try again.";

    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (password == null || repeatPassword == null) {
            throw new PasswordValidationException(MESSAGE);
        }

        if (password.length() < 10 && repeatPassword.length() < 10) {
            throw new PasswordValidationException(MESSAGE);
        }

        if (!password.equals(repeatPassword)) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }

}
