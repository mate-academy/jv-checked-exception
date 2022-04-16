package core.basesyntax;

public class PasswordValidator {
    public void validate(String password, String repeatPassword) {
        try {
            throw new PasswordValidationException("Wrong passwords");
        } catch (PasswordValidationException e) {
            System.out.println("Your passwords are incorrect. Try again.");
        }
    }
}
