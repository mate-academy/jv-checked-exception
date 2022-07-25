package core.basesyntax;

public class PasswordValidator {
    private final int minLength = 10;

    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if ((password == null) || (repeatPassword == null)) {
            throw new PasswordValidationException("Wrong passwords");
        }
        if (!password.equals(repeatPassword)) {
            throw new PasswordValidationException("Wrong passwords");
        }
        if ((password.length() < minLength) || (repeatPassword.length() < minLength)) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
