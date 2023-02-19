package core.basesyntax;

public class PasswordValidator {
    public void validate(String password, String repeatPassword) throws PasswordValidationException {
        boolean comparePassword = password.equals(repeatPassword);
        if (!comparePassword || password.length() <= 9) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
