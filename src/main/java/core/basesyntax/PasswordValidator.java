package core.basesyntax;

public class PasswordValidator {
    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (password == null || repeatPassword == null) {
            throw new PasswordValidationException("Wrong passwords");
        }
        int length = password.length();
        if (!password.equals(repeatPassword) || length < 10) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
