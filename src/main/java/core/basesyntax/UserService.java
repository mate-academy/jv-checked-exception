package core.basesyntax;

public class UserService {
    public void registerUser(User user) {
        try {
            new PasswordValidator()
                    .validate(user.getPassword(), user.getRepeatPassword());
        } catch (Exception e) {
            System.out.println("Your passwords are incorrect. Try again.");
            return;
        }
        saveUser(user);
    }

    public void saveUser(User user) {
        System.out.println("User " + user.toString() + " was saved to database!!!");
    }
}
