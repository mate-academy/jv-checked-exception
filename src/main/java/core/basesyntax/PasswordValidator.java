package core.basesyntax;

public class PasswordValidator {
    public void validate(String password, String repeatPassword) throws PasswordValidationException {
        if (password != null && repeatPassword != null) {
            if (password.equals(repeatPassword) == false | password.length() < 10) {
                throw new PasswordValidationException("Wrong passwords");
            }
        }
        else if (password == null | repeatPassword == null) {
            throw new PasswordValidationException("Enter passwords");
        }
    }
}
