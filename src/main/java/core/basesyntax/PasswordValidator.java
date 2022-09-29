package core.basesyntax;

public class PasswordValidator {
    public void validate(String password, String repeatPassword) throws PasswordValidationException {
        int maxLength = 10;
        if (password == null || repeatPassword == null
                ||password.length() < maxLength || repeatPassword.length() < maxLength
                || !password.equals(repeatPassword)) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
