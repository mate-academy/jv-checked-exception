package core.basesyntax;

public class PasswordValidator {
    public static final int MIN_LENGTH = 10;

    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (password == null
                || repeatPassword == null
                || !password.equals(repeatPassword)
                 || password.length() < MIN_LENGTH) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}


