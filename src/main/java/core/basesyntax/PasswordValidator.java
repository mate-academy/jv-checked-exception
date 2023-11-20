package core.basesyntax;

public class PasswordValidator {
    public void validate(String password, String repeatPassword) throws PasswordValidationException {
        boolean correctPasswords = password.length() >= 10
                && repeatPassword.length() >= 10;
        if (!(password.equals(repeatPassword)) && !(correctPasswords)) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
