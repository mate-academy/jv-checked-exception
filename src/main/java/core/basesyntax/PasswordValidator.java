package core.basesyntax;

public class PasswordValidator {
    public static final int MIN_PASS_LENGTH = 10;

    public void validate(String password, String repeatPassword) throws PasswordValidationException {
        if (repeatPassword == null || password == null) {
            throw new PasswordValidationException("Wrong passwords");
        }
        boolean validPassword = repeatPassword.equals(password);
        if (password.length() < MIN_PASS_LENGTH || !validPassword) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
