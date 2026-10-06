package core.basesyntax;

public class PasswordValidator {
    public void validate(String password, String repeatPwd) throws PasswordValidationException {
        if (password == null || repeatPwd == null) {
            throw new PasswordValidationException("Wrong passwords");
        }
        if (!password.equals(repeatPwd)) {
            throw new PasswordValidationException("Wrong passwords");
        } else if (password.length() < 10) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
