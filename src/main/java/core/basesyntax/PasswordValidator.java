package core.basesyntax;

public class PasswordValidator {
    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        try {
            if (password == null || repeatPassword == null) {
                throw new PasswordValidationException("Null input data");
            } else if (!password.equals(repeatPassword)) {
                throw new PasswordValidationException("Wrong passwords");
            } else if (password.length() < 10) {
                throw new PasswordValidationException("Wrong passwords");
            }
        } catch (PasswordValidationException e) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
