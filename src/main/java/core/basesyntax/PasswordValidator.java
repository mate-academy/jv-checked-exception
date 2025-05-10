package core.basesyntax;

public class PasswordValidator {
    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (password == null || repeatPassword == null) {
            throw new PasswordValidationException("Wrong passwords");
        } else if (password.equals(repeatPassword)
                && password.length() >= 10
                && repeatPassword.length() >= 10) {
            System.out.println();
        } else {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
