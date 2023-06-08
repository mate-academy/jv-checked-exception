package core.basesyntax;

public class PasswordValidator {
    private static final int maxLength = 10;
    private static final PasswordValidationException pw =
            new PasswordValidationException("Wrong passwords");

    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if ((password == null || password.length() < maxLength || !(password.equals(repeatPassword)))) {
            throw pw;
        }
    }
}
