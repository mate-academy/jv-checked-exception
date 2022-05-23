package core.basesyntax;

public class PasswordValidator {

    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (password == null || repeatPassword == null) {
            throw new PasswordValidationException("Please, enter correct password!!");
        }
        if (!password.equals(repeatPassword) || repeatPassword.length() < 10) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
