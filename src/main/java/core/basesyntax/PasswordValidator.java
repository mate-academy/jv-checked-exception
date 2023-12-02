package core.basesyntax;

public class PasswordValidator {
    private static final int PASS_LENGTH = 10;

    public void validate(String password, String repeatPassword) throws
            PasswordValidationException {
        if (password == null || !password.equals(repeatPassword)
                || password.length() < PASS_LENGTH) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}


