package core.basesyntax;

public class PasswordValidator {
    public void validate(String password,String repeatPassword) throws PasswordValidationException {
        if (password == null || password.length() == 0) {
            throw new PasswordValidationException(password + "should not be - null or \"\"");
        }
        if (password.equals(repeatPassword) && (password.length() >= 10)) {
            boolean statement = true;
        } else {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
