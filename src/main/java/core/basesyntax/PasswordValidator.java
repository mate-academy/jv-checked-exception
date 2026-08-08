package core.basesyntax;

public class PasswordValidator {
    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        //write your code here
        final int MP = 10;
        if (password == null
                || !password.equals(repeatPassword)
                || password.length() < MP) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
