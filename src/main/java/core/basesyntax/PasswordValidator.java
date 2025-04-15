package core.basesyntax;

public class PasswordValidator {
    private static final int MAX_LENGHT = 10;

    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (repeatPassword == null || password.length() < MAX_LENGHT
                || !password.equals(repeatPassword)) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
