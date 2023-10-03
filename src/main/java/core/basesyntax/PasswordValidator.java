package core.basesyntax;

public class PasswordValidator {
    private static final int PASSWORD_LENGTH = 10;

    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if ((password == null) || (!password.equals(repeatPassword)) || (password.length() < 10)
                || (repeatPassword.length() < 10)) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
