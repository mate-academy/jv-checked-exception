package core.basesyntax;

public class PasswordValidator {
    public void validate(String password, String repeatPassword)
                throws PasswordValidationException {

        if (password == null) {
            throw new PasswordValidationException("Wrong passwords");
        }

        if (password.equals(repeatPassword) && password.length() >= 10) {
            password = repeatPassword;
        } else {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
