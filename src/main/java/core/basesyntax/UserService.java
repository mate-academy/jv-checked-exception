package core.basesyntax;

public class UserService {
    private PasswordValidator passwordValidator = new PasswordValidator();

    public void registerUser(String email, String password, String repeatPassword) {
        try {
            passwordValidator.validate(password, repeatPassword);
            saveUser(email, password);
            System.out.println("User registered successfully!");
        } catch (PasswordValidationException e) {
            System.out.println("Your passwords are incorrect. Try again.");
        }
    }
    private void saveUser(String email, String password) {
        System.out.println("User with email " + email + " saved to database.");
    }
}
