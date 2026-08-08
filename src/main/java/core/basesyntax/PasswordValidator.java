package core.basesyntax;

public class PasswordValidator {

    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (password == null || repeatPassword == null) {
            throw new PasswordValidationException();
        }
        if (!password.equals(repeatPassword) || password.length() < 10) {
            throw new PasswordValidationException();
        }
    }
}
