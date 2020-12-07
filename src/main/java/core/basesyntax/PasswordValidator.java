package core.basesyntax;

public class PasswordValidator {
    public boolean validate(String password, String repeatPassword)
            throws PasswordValidationException {
        boolean isValidated = password != null && password.length() >= 10
                && password.equals(repeatPassword);
        if (!isValidated) {
            throw new PasswordValidationException("Wrong passwords");
        }
        return true;
    }
}
