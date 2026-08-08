package core.basesyntax;

public class PasswordValidator {
    private boolean isPasswordValid;
    private boolean isLengthValid;

    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (password == null || repeatPassword == null) {
            throw new PasswordValidationException("Wrong passwords");
        }
        isPasswordValid = password.equals(repeatPassword);
        isLengthValid = password.length() >= 10 && repeatPassword.length() >= 10;
        if (!isPasswordValid || !isLengthValid) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
