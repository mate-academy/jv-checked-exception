package core.basesyntax;

public class PasswordValidator {
    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (password.equals(repeatPassword) && password.length() >= 10) {
            System.out.println("Your password is correctly!");
        }
    }
}
