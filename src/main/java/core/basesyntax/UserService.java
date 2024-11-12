package core.basesyntax;

public class UserService {
    private PasswordValidator passwordValidator = new PasswordValidator();

    public void registerUser(User user) {
        try {
            passwordValidator.validate(user.getPassword(), user.getRepeatPassword());
            saveUser(user.getEmail(), user.getPassword());
            System.out.println("User registered successfully!");
        } catch (PasswordValidationException e) {
            System.out.println("Your passwords are incorrect. Try again.");
        }
    }

    private void saveUser(String email, String password) {
        System.out.println("User with email " + email + " saved to database.");
    }

}
