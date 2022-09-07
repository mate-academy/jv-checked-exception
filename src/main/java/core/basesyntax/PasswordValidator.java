package core.basesyntax;

public class PasswordValidator {

    private static final int PASSWORD_LENGTH = 10;

    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (password == null) {
            throw new PasswordValidationException("Wrong passwords");
        }
        if (password.length() < PASSWORD_LENGTH || !password.equals(repeatPassword)) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
