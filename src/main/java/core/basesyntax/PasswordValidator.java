package core.basesyntax;

public class PasswordValidator {
    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (password == null || repeatPassword == null) {
            throw new PasswordValidationException("Wrong passwords");
        }
        if (password.toCharArray().length == 0) {
            throw new PasswordValidationException("Wrong passwords");
        }
        if (password != repeatPassword || repeatPassword.toCharArray().length < 10) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
