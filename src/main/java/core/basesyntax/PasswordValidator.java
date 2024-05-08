package core.basesyntax;

public class PasswordValidator extends Exception {
    public static void validate(String password, String repeatPassword)
        throws PasswordValidationException {
        if (password == null || repeatPassword == null || password.length() < 10) {
            throw new PasswordValidationException("Wrong passwords");
        } else if (!password.equals(repeatPassword)) {
            throw new PasswordValidationException("Your passwords are incorrect. Try again.");
        }
    }
}
