package core.basesyntax;

public class PasswordValidator {
    public void validate(String password, String repPassword) throws PasswordValidationException {
        if (!(password.equals(repPassword)) || (password.length() < 10)) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
