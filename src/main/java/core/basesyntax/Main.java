package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        PasswordValidator validator = new PasswordValidator();
        try {
            validator.validate("myPassword123", "myPassword123");
            System.out.println("Password is valid.");
        } catch (PasswordValidationException e) {
            System.out.println(e.getMessage());
        }
    }
}
