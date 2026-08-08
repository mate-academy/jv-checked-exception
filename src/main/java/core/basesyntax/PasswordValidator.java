package core.basesyntax;

public class PasswordValidator {
    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (password == null || repeatPassword == null
                || password.equals("") || repeatPassword.equals("")
                || !(password.equals(repeatPassword))) {
            throw new PasswordValidationException("Wrong passwords");
        }
        if (password.length() < 10) {
            throw new PasswordValidationException("Your passwords are incorrect. Try again.");
        }
    }
}
