package core.basesyntax;

public class PasswordValidator {
    public void validate(String password, String repeatPassword) {
        if (password.equals(repeatPassword) && password.length() < 11) {
            System.out.println("Password is correct!");
        }
        throw new PasswordValidationException("Wrong passwords");
    }
}
