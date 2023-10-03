package core.basesyntax;

public class PasswordValidator {
    public static final int MIN_CHARACTER = 10;

    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (password == null || password.length() < MIN_CHARACTER
                || !password.equals(repeatPassword)) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
