package core.basesyntax;

public class PasswordValidator {
    private static final int PASSWORD_LENGTH = 10;

    public void validate(User user) throws PasswordValidationException {
        String password = user.getPassword();
        String repeatPassword = user.getRepeatPassword();
        boolean passwordLength = ((password.length() >= PASSWORD_LENGTH) && (repeatPassword.length() >= PASSWORD_LENGTH));
        boolean passwordEqual = password.equals(repeatPassword);
        if (!passwordEqual && passwordLength) {
            throw new PasswordValidationException();
        }
    }
}
