package core.basesyntax;

public class UserService {
    public void registerUser(User user) {
        if (user == null) {
            System.out.println("Invalid user data. Try again.");
            return;
        }
        PasswordValidator passwordValidator = new PasswordValidator();

        try {
            passwordValidator.validate(user.getPassword(), user.getRepeatPassword());
            saveUser(user);
        } catch (PasswordValidationException e) {
            System.out.println("Your passwords are incorrect. Try again.");
        } catch (Exception e) {
            System.out.println("Failed to save user: " + e.getMessage());
        }
    }

    private void saveUser(User user) {

        try {
            if (user == null) {
                throw new IllegalArgumentException("User is null");
            }
            System.out.println("User " + user + " was saved to database!!!");
        } catch (Exception e) {
            System.out.println("Failed to save user: " + e.getMessage());
        }
    }
}
