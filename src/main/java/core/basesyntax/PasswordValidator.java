package core.basesyntax;

public class PasswordValidator {
    static final int NUMBER = 10;

    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (password.length() >= NUMBER && password.equals(repeatPassword)) {
            return;
        }
        throw new PasswordValidationException("Wrong passwords");
    }
}
