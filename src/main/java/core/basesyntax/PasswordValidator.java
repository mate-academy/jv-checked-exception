package core.basesyntax;

public class PasswordValidator {
    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (passwordInvalid(password, repeatPassword)) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }

    private boolean passwordInvalid(String password, String repeatPassword) {
        return (password == null || password.trim().isEmpty())
                || !password.equals(repeatPassword) || password.length() < 10;
    }
}
