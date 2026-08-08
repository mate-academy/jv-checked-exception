package core.basesyntax;

public class PasswordValidator {
    public static boolean validate(String password, String repeatPassword) throws PasswordValidationException {
        if (password.equals(repeatPassword) && password.length() >= 10) {
        return true;
        }
        else {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
