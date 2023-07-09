package core.basesyntax;

public class PasswordValidator {
    private final int minPasswordLength = 10;

    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (password == null
                || repeatPassword == null
                || !password.equals(repeatPassword)
                || password.length() < minPasswordLength) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
