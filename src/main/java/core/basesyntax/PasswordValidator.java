package core.basesyntax;

public class PasswordValidator {
    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (password == null || password.isEmpty() ||
                repeatPassword == null || repeatPassword.isEmpty() ||
                !password.equals(repeatPassword) ||
                password.length() < 10) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
