package core.basesyntax;

public class PasswordValidator {
    public static void validate(String password, String repeatPassword) throws PasswordValidationException {
        if (password == null || repeatPassword == null ||
                password.isEmpty() || repeatPassword.isEmpty() ||
                password.length() < 10 || !password.equals(repeatPassword)) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
