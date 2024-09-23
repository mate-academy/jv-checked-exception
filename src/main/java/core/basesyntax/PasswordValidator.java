package core.basesyntax;

public class PasswordValidator {
    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (password == null || repeatPassword == null) {
            throw new PasswordValidationException("Wrong passwords");
        }

        boolean isPasswordMatch = password.equals(repeatPassword);

        if (!isPasswordMatch || password.length() < 10) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
