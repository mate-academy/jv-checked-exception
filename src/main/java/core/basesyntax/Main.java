package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        String password = "password123";
        String repeatPassword = "password123";

        PasswordValidator validator = new PasswordValidator();

        try {
            validator.validate(password, repeatPassword);
            System.out.println("Password is valid");
        } catch (PasswordValidationException e) {
            System.out.println(e.getMessage());
        }
    }
}
