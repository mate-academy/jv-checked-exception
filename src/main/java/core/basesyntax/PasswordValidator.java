package core.basesyntax;

public class PasswordValidator {
    public void validate(String password, String repPassword) throws PasswordValidationException {
        if (!(password == null) && (password.length() > 0) && !(repPassword == null) && (repPassword.length() > 0)) {
            if (!(password.equals(repPassword)) || (password.length() < 10)) {
                throw new PasswordValidationException("Wrong passwords");
            }
        }
    }
}
