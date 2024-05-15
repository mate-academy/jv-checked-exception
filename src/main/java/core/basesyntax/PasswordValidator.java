package core.basesyntax;

public class PasswordValidator {
    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        boolean a = password == null;
        if (a) {
            throw new PasswordValidationException("Wrong passwords");
        } else if (!(password.equals(repeatPassword) && password.length() >= 10)) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
