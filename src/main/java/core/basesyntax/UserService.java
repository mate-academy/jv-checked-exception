package core.basesyntax;

public class UserService {
    public void registerUser(User user) {
        PasswordValidator password = new PasswordValidator();
        try {
            password.validate(user.getPassword(), user.getRepeatPassword());
            saveUser(user);
        } catch (Exception exception) {
            System.out.println("Your passwords are incorrect. Try again.");
        }
    }

    public void saveUser(User user) {
        System.out.println("User " + user.toString() + " was saved to database!!!");
    }
}
