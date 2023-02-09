package core.basesyntax;

public class PasswordValidator {
    public static final int PASSWORD_LENGTH = 10;

    public void validate(String password, String repeatPassword) throws PasswordValidationException {
        if (password == null || repeatPassword == null) {
            throw new PasswordValidationException("Wrong passwords");
        }
        if (password.length() == 0 || repeatPassword.length() == 0) {
            throw new PasswordValidationException("Wrong passwords");
        }
        if(password.length() < PASSWORD_LENGTH) {
            throw new PasswordValidationException("Wrong passwords");
        }
        try {
            if (password.equals(repeatPassword)) {
                return;
            }
        } catch (RuntimeException e) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
