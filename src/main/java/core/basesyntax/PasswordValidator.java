package core.basesyntax;

public class PasswordValidator {

    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (password == null || repeatPassword == null) {
            throw new PasswordValidationException("NullPointerException");
        }
        if (password.length() < 10 && repeatPassword.length() < 10
                && password.length() != repeatPassword.length()) {
            throw new PasswordValidationException("Wrong password");
        }
        if (!password.equals(repeatPassword)) {
            throw new PasswordValidationException("PasswordValidationException");
        }
    }
}
