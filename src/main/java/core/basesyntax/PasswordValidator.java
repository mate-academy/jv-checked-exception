package core.basesyntax;

public class PasswordValidator {
    private final int minLength = 10;

    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (password == null || repeatPassword == null
                || !password.equals(repeatPassword)
                || password.length() < minLength) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
