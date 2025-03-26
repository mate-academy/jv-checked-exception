package core.basesyntax;

public class PasswordValidator {
    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        //write your code here
        if (password == null || repeatPassword == null) {
            System.out.println("Password shouldn't be empty");
        } else if (password.equals(repeatPassword) && password.length() >= 10) {
            System.out.println("Password is valid");
        } else {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
