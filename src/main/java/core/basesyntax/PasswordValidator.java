package core.basesyntax;

public class PasswordValidator {
    public void validate(String password, String repPassword) throws PasswordValidationException {
        try {
            if ((!(password.equals(repPassword))) || (password.length() < 10)
                       || (repPassword.length() < 10)
                       || ((password == null) ^ (repPassword == null))) {
                throw new PasswordValidationException("Wrong passwords");
            }
        } catch (NullPointerException e) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}

