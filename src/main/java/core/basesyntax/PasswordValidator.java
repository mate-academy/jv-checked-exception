package core.basesyntax;

public class PasswordValidator {

    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (password == null || repeatPassword == null) {
            throw new PasswordValidationException("Password is empty");
        }
        if (password.equals(repeatPassword) && password.length() >= 10) {
            //System.out.println("Password '" + password + "' was successfully set");
        } else {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
