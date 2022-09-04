package core.basesyntax;

public class PasswordValidator {
    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        boolean check = password.equals(repeatPassword);
        if (password.length() <= 10 || repeatPassword.length() <= 10 || !check) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
