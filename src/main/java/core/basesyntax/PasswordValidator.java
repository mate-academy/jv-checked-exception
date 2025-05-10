package core.basesyntax;

public class PasswordValidator {
    private final int minimumPasswordLength = 10;

    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (password == null || !password.equals(repeatPassword)
                || password.length() < minimumPasswordLength) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
