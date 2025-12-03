package core.basesyntax;

public class PasswordValidator {
    private final static int ALLOWED_LENGTH = 10;

    public void validate(String password, String repeatPassword) {
        if (!password.equals(repeatPassword) || password.length() < ALLOWED_LENGTH) {
            throw new PasswordValidationException();
        }
    }
}
