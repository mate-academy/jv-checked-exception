package core.basesyntax;

public class UserService {
    private final PasswordValidator passwordValidator = new PasswordValidator();

    public void registerUser(String email, String password, String repeatPassword) {
        try {
            passwordValidator.validate(password, repeatPassword);
            saveUser(email, password);
            System.out.println("The user is successfully registered in email: " + email);
        } catch (PasswordValidationException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    public void saveUser(String email, String password) {
        System.out.println("User with email " + email + " and password "
                + password + " was saved to database!!!");
    }
}
