package core.basesyntax;

public class PasswordValidator {
    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (password == null || repeatPassword == null) {
            throw new PasswordValidationException("Wrong passwords");
        }

        if (repeatPassword.equals(password)
                & repeatPassword.length() >= 10
                & password.length() >= 10) {
            System.out.println();
        } else {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
