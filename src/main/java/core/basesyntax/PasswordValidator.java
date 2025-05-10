package core.basesyntax;

public class PasswordValidator {
    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        try {
            if (!password.equals(repeatPassword) || password.length() < 10) {
                throw new PasswordValidationException("Wrong passwords");
            }
        } catch (Exception e) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
