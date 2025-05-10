package core.basesyntax;

public class PasswordValidator {
    private static final int MIN_PASSWORD_LETTERS = 10;

    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (password == null | repeatPassword == null) {
            throw new PasswordValidationException("Your passwords are incorrect. Try again.");
        } else if (!password.equals(repeatPassword)) {
            throw new PasswordValidationException("Wrong passwords");
        } else if (password.length() < MIN_PASSWORD_LETTERS) {
            throw new PasswordValidationException("Your passwords are incorrect. Try again.");
        }
    }
}
