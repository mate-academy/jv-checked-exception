package core.basesyntax;

public class PasswordValidator {
    public void validate(String password, String repeatPassword) 
                 throws PasswordValidationException {
        if (password == null || repeatPassword == null) {
            return;
        }
        if ((password.equals(repeatPassword)
            && password.length() >= 10)) == false) {
            throw new PasswordValidationException("Your passwords are incorrect."
		        + "Try again.");
       }
    }
}
