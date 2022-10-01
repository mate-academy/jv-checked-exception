package core.basesyntax;

public class UserService {
    public void registerUser(User user) {
        try {
            PasswordValidator validator = new PasswordValidator();
            validator.validate(user.getPassword(), user.getRepeatPassword());
        } catch (Exception e) {
            System.out.println("Your passwords are incorrect. Try again.");
            return;
        }
        this.saveUser(user);
    }

    public void saveUser(User user) {
        System.out.println("User " + user.toString() + " was saved to database!!!");
    }
}
