package core.basesyntax;

public class PasswordValidator {
    public static final int SAFE_PASSWORD_LENGTH = 10;

    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (password != null && password.equals(repeatPassword)
                && password.length() >= SAFE_PASSWORD_LENGTH) {
            System.out.println();
        } else {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
