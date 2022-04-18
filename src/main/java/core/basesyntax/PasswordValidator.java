package core.basesyntax;

public class PasswordValidator {
    public void validate(String password, String reptPassword) throws PasswordValidationException {
        //write your code here
        if (password == null) {
            throw new PasswordValidationException("Wrong passwords");
        }

        if (!password.equals(reptPassword) || password.length() < 10) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
