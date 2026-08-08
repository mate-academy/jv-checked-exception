package core.basesyntax;

public class PasswordValidator {
    public static final int MIN_PASSWORD_lENGTH = 10;

    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (password == null || repeatPassword == null
                || password.length() < MIN_PASSWORD_lENGTH
                || !password.equals(repeatPassword)
        ) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
