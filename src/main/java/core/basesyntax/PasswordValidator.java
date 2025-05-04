package core.basesyntax;

public class PasswordValidator {
    public void validate(String password,
                         String repeatPassword) throws PasswordValidationException {
        if (password != null
                && password.equals(repeatPassword)
                && password.length() >= 10) {
            System.out.println("Password validation successful");
        } else {
            throw new PasswordValidationException("Your passwords are incorrect. Try again.");
        }
    }
}
