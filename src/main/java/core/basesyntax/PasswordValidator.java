package core.basesyntax;

public class PasswordValidator {
    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (password.equals(repeatPassword) != true || password.length() < 10
                || (password == null || repeatPassword == null)) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
