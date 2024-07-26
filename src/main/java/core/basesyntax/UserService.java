package core.basesyntax;

public class UserService {
    public void registerUser(User user) {
        PasswordValidator passwordValidator = new PasswordValidator();
        try {
            passwordValidator.validate(user.getPassword(), user.getRepeatPassword());
            saveUser(user.getEmail(), user.getPassword());
        } catch (PasswordValidationException e) {
            System.out.println("Your passwords is incorrect. Please try again.");
        }
    }

    public void saveUser(String user, String password) {
        System.out.println("User " + user.toString() + " was saved to database!!!");
    }
}
