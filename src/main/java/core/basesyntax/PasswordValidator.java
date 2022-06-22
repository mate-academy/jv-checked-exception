package core.basesyntax;

public class PasswordValidator {
    public static final int MINIMUM_LENGTH = 10;

    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (password == null || repeatPassword == null) {
            throw new RuntimeException();
        }
        if (!password.equals(repeatPassword) || password.length() < MINIMUM_LENGTH) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
