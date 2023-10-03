package core.basesyntax;

public class PasswordValidator {
    private static final int MIN_VALUE_OF_PASSWORD = 10;

    public boolean validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (password == null || repeatPassword == null) {
            throw new PasswordValidationException("Wrong passwords");
        }
        if (password.length() < MIN_VALUE_OF_PASSWORD || !password.equals(repeatPassword)) {
            throw new PasswordValidationException("Wrong passwords");
        }
        return true;
    }
}
