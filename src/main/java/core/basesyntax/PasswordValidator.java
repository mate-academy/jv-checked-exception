package core.basesyntax;

public class PasswordValidator {
    private static final int minPasswordLength = 10;
    private static final String validationErrorMsg = "Wrong passwords";

    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (password == null || repeatPassword == null
                || !password.equals(repeatPassword) || password.length() < minPasswordLength) {
            throw new PasswordValidationException(validationErrorMsg);
        }
    }
}
