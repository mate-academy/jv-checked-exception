package core.basesyntax;

public class PasswordValidator {
    public void validate(String password, String repeatPassword) {
        //write your code here
        if (!password.equals(repeatPassword) || password.length() >= 10) {
            throw new IllegalArgumentException("Wrong passwords");
        }
    }
}
