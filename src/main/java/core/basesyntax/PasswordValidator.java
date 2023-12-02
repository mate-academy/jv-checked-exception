package core.basesyntax;

public class PasswordValidator {
    private static final int MIN_PASS = 10;

    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (password == null || repeatPassword == null) {
            throw new PasswordValidationException("Input passwords.");
        }
        if (!password.equals(repeatPassword)) {
            throw new PasswordValidationException("Wrong passwords");
        }
        if (password.length() < MIN_PASS) {
            throw new PasswordValidationException("Your passwords are incorrect. Try again.");
        }
        return;
    }
}
