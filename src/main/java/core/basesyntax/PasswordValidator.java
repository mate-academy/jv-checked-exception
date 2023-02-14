package core.basesyntax;

public class PasswordValidator {
    public void validate(String password, String repeatPassword) throws PasswordValidationException {
        try {
            password.equals(repeatPassword);
        } catch (Exception e) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
