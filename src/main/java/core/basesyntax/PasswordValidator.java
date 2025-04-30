package core.basesyntax;

public class PasswordValidator {
    private static final int PASSWORD_MAX_LENGTH = 10;

    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        boolean isPasswordNull = password == null || repeatPassword == null;

        if (isPasswordNull || !password.equals(repeatPassword) || password.length() < 10) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
