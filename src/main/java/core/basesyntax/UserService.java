package core.basesyntax;

import java.util.logging.Logger;

public class UserService {
    private static final Logger logger = Logger.getLogger(UserService.class.getName());
    private final UserRepository userRepository;
    private final PasswordValidator passwordValidator;

    public UserService(UserRepository userRepository, PasswordValidator passwordValidator) {
        this.userRepository = userRepository;
        this.passwordValidator = passwordValidator;
    }

    public boolean registerUser(String username, String password, String repeatPassword) {
        try {
            // Validate the passwords
            passwordValidator.validate(password, repeatPassword);

            // Create a new user with all required fields
            User user = new User(username, username + "@example.com", password, repeatPassword);

            // Save the user to the repository
            userRepository.saveUser(user);

            // Log success
            logger.info("User " + username + " registered successfully!");
            return true;
        } catch (PasswordValidationException e) {
            // Log and handle validation failure
            logger.warning("Failed to register user " + username + ": " + e.getMessage());
            System.out.println("Your passwords are incorrect. Try again.");
            return false;
        }
    }
}