package core.basesyntax;

public class PasswordValidator {
    public static final int MIN_VALUE_FOR_PASSWORD = 10;

    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (password != repeatPassword || password.length() < MIN_VALUE_FOR_PASSWORD
                || password == null || repeatPassword == null) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
