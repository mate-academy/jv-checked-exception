package core.basesyntax;

public class PasswordValidator {
    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (password == null || repeatPassword == null) {
            throw new PasswordValidationException("Wrong passwords");
        }
        boolean comparePassword = password.equals(repeatPassword);
        if (!comparePassword || password.length() <= 9) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
