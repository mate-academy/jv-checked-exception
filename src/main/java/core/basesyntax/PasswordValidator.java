package core.basesyntax;

public class PasswordValidator {
    public static final int MIN_LENGTH_OF_PASSWORD = 10;

    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (password == null || repeatPassword == null) {
            throw new PasswordValidationException("Wrong passwords");
        } else if (!password.equals(repeatPassword) || password.length() < MIN_LENGTH_OF_PASSWORD) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
