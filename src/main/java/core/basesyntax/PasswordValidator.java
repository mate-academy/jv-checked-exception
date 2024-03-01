package core.basesyntax;

public class PasswordValidator {
    public void validate(String password, String repeatPass) throws PasswordValidationException {
        if (password == null || password.length() < 10 || !password.equals(repeatPass)) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
