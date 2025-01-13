package core.basesyntax;

public class PasswordValidator {
    public static void validate(String password, String repeatPassword) throws PasswordValidationException {
        if (password.equals(repeatPassword) && password.length() >= 10) {
            System.out.println("Matching Passwords");
            return;
        }
        throw new PasswordValidationException("Wrong passwords");
    }
}
