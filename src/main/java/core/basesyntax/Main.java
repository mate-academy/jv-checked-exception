package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        PasswordValidator passwordValidator = new PasswordValidator();

        try {
            passwordValidator.validate("short", "short");
        } catch (PasswordValidationException e) {
            System.out.println(e.getMessage());
        }

        try {
            passwordValidator.validate("correctPassword",
                    "correctPassword");
            System.out.println("Passwords have been successfully validated.");
        } catch (PasswordValidationException e) {
            System.out.println(e.getMessage());
        }
    }
}
