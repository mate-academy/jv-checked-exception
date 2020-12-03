package core.basesyntax;

public class PasswordValidator {
    public boolean validate(String password, String repeatPassword) {


        if(repeatPassword.length() >= 10 && password.length() >= 10) {
            return true;
        } else {

        }

        return false;
    }
}
