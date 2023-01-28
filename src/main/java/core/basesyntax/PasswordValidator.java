package core.basesyntax;

public class PasswordValidator {
    public void validate(String password, String repeatPassword) {
        //write your code here
        String message = null;
        try {
            if (password.length() < 10) {
                message = "Password length is less than 10 characters";
            }
            else if (!(password.equals(repeatPassword))){
                message = "Passwords doesn't match";
            }
            if (message != null) throw new PasswordValidationException(message);
        } catch (PasswordValidationException p){
            System.out.println(p.getMessage());
        }
    }
}
