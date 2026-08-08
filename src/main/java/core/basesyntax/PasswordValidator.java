package core.basesyntax;

public class PasswordValidator {
    public static final int MIN_SYMBOL_COUNT = 10;

    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (password == null || !password.equals(repeatPassword)
                || password.length() < MIN_SYMBOL_COUNT) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
