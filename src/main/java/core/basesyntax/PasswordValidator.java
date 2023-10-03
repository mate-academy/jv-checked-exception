package core.basesyntax;

public class PasswordValidator {
    private static final int MIN_LONGPASSWORD = 10;

    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (password == null || repeatPassword == null) {
            throw new PasswordValidationException("Wrong passwords");
        }
        if (!password.equals(repeatPassword) || (password.length() < MIN_LONGPASSWORD)) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
