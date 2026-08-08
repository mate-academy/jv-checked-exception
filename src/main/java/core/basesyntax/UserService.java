package core.basesyntax;

public class UserService {
    public void registerUser(User user) {
        PasswordValidator check = new PasswordValidator();
        try {
            check.validate(user.getPassword(), user.getRepeatPassword());
            new UserService().saveUser(user);
        } catch (PasswordValidationException pass) {
            System.out.println("Your passwords are incorrect. Try again.");
        }
    }

    public void saveUser(User user) {
        System.out.println("User " + user.toString() + " was saved to database!!!");
    }
}
