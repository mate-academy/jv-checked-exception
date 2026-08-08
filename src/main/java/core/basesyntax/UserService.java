package core.basesyntax;

public class UserService {
    public void registerUser(User user) {
        PasswordValidator pv = new PasswordValidator();
        try {
            pv.validate(user.getPassword(), user.getRepeatPassword());
            saveUser(user);
        } catch (PasswordValidationException e) {
            System.out.println("Sorry not valid password");
        }

    }

    public void saveUser(User user) {
        System.out.println("User " + user.toString() + " was saved to database!!!");
    }
}
