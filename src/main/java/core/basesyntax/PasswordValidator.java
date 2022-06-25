package core.basesyntax;

public class PasswordValidator {
    static final int PASSWORD_LENGTH = 10;

    public void validate(String password,String repeatPassword) throws PasswordValidationException {
        if (password == null || repeatPassword == null) {
            throw new PasswordValidationException("Wrong passwords");
        } else if (password.equals(repeatPassword) == false
                || password.length() < PASSWORD_LENGTH
                || repeatPassword.length() < PASSWORD_LENGTH) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
