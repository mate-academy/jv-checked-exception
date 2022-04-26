package core.basesyntax;

public class PasswordValidator {
    public void validate(String password, String repeatPassword) throws PasswordValidationException {
        //write your code here
        if (password.equals(repeatPassword) && password.length()>=10 ) {
            //System.out.println("Password ok");
        } else {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
