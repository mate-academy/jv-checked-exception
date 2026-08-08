package core.basesyntax;

public class PasswordValidator {
    private static final int minPasswordLength = 10;

    public void validate(String password, String repeatPassword)
                                throws PasswordValidationException {
        if (password == null
                || password.length() < minPasswordLength
                || !password.equals(repeatPassword)) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
