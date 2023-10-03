package core.basesyntax;

public class UserService {
    public void registerUser(User user) {
        PasswordValidator newPassword = new PasswordValidator();
        try {
            newPassword.validate(user.getPassword(), user.getRepeatPassword());
            saveUser(new User(user.getEmail(), user.getPassword(), user.getRepeatPassword()));
        } catch (PasswordValidationException e) {
            System.out.println("Your passwords are incorrect. Try again.");
        }
    }

    public void saveUser(User user) {
        System.out.println("User " + user.toString() + " was saved to database!!!");
    }
}
