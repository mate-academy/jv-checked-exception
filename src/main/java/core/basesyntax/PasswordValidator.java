package core.basesyntax;

public class PasswordValidator {
    public void validate(String password, String repeatPassword) {
        //write your code here
        if(password.length() < 10 || password != repeatPassword) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
