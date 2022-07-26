package core.basesyntax;

public class PasswordValidator {
    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (password == null || password.length() < 10 || !password.equals(repeatPassword)) {
            throw new PasswordValidationException(password == null
                    || password.equals(repeatPassword)
                    ? "Your passwords are incorrect. Try again." : "Wrong passwords");
        }
    }
}
