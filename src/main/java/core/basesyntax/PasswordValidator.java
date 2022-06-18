package core.basesyntax;

public class PasswordValidator {
    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (password == null | repeatPassword == null) {
            throw new PasswordValidationException("Wrong passwords");
        }
        if ((password.length() | repeatPassword.length()) < 10) {
            throw new PasswordValidationException("Wrong passwords");
        }
        boolean validate = password.equals(repeatPassword);
        if (!validate) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
