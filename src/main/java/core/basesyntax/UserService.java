package core.basesyntax;

public class UserService {
    // User user = new User("sas","ss","ss");
    private PasswordValidator check = new PasswordValidator();

    public void registerUser(User user) {
        try {
            check.validate(user.getPassword(), user.getRepeatPassword());
            saveUser(user);
        } catch (PasswordValidationException e) {
            System.out.println("Your passwords are incorrect. Try again.");
        }
    }

    public void saveUser(User user) {
        System.out.println("User " + user.toString() + " was saved to database!!!");
    }
}
