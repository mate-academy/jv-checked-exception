package core.basesyntax;

public class UserService {
    private UserRepository userRepository = new UserRepository();

    public void registerUser(String username, String password, String repeatPassword) {
        PasswordValidator validator = new PasswordValidator();
        try {
            // Validate the passwords
            validator.validate(password, repeatPassword);

            // Save the user if validation is successful
            User user = new User(username, password);
            userRepository.saveUser(user);
            System.out.println("User " + user.toString() + " was saved to database!!!");
        } catch (PasswordValidationException e) {
            // Handle validation failure
            System.out.println("Your passwords are incorrect. Try again.");
        }
    }
}