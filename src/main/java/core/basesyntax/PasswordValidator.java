package core.basesyntax;

public class PasswordValidator {

    public void validate(String password, String repeatPassword) throws PasswordValidationException {
       if (password == null || repeatPassword == null) {
           throw new PasswordValidationException("Your passwords are incorrect. Try again.");
       }
       if (password.isEmpty() || repeatPassword.isEmpty()) {
           throw new PasswordValidationException("Your passwords are incorrect. Try again.");
       }
        if (!password.equals(repeatPassword)) {
            throw new PasswordValidationException("Your passwords are incorrect. Try again.");
       }
        if (password.length() <= 9) {
            throw new PasswordValidationException("Your passwords are incorrect. Try again.");
        }
    }
}
