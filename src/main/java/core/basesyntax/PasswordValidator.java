package core.basesyntax;

public class PasswordValidator {
    private static final int PASSWORD_MIN_LENGTH = 10;

    public void validate(String password, String repeatPassword) throws PasswordValidationException {
        boolean passwordLength = ((password.length() >= 10) && (repeatPassword.length() >= 10));
        boolean passwordEqual = password.equals(repeatPassword);
        if (passwordEqual && passwordLength) {
            return;
        } throw new PasswordValidationException();
    }
}
