package core.basesyntax;

public class UserService {

    private final PasswordValidator passwordValidator;

    public UserService() {
        this.passwordValidator = new PasswordValidator();
    }

    public void registerUser(User user) {
        try {
            passwordValidator.validate(user.getPassword(), user.getRepeatPassword());
            saveUser(user);

        } catch (PasswordValidationException e) {
            System.out.println("Your passwords are incorrect. Try again.");
        } catch (Exception e) {
            System.out.println("An error occurred during user registration: " + e.getMessage());
        }
    }

    private void saveUser(User user) {
        System.out.println("User "
                + user.toString()
                + " was saved to database!!!");
    }

    public static void main(String[] args) {
        UserService userService = new UserService();
        User user = new User("user@example.com", "password123", "password123");
        userService.registerUser(user);
        User userWithIncorrectPasswords = new User("user@example.com", "pass", "pass");
        userService.registerUser(userWithIncorrectPasswords);
    }
}
