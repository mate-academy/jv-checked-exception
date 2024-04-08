package core.basesyntax;

public class PasswordValidator {
    public static final int MAX_LENGTH = 10;

    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (password == null || repeatPassword == null || !password.equals(repeatPassword)
                || password.length() < MAX_LENGTH || repeatPassword.length() < MAX_LENGTH) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
