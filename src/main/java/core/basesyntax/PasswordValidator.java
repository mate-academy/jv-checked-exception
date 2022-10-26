package core.basesyntax;

public class PasswordValidator extends Exception {
    public void validate(String password, String repeatPassword) throws Exception {
        if (!password.equals(repeatPassword) && password.length() < 10) {
            throw new PasswordValidationException ("Wrong passwords");
        }
    }
}
