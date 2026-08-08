package core.basesyntax;

public class PasswordValidator {
    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (repeatPassword == null & password == null) {
            throw new PasswordValidationException("Wrong passwords");
        }
        if (!password.equals(repeatPassword)
                || repeatPassword.length() < 10 && password.length() < 10) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
