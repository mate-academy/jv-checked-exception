package core.basesyntax;

public class UserService extends PasswordValidator {
    public void registerUser(User user) {
        try {
            if (validate(user.getPassword(), user.getRepeatPassword())) {
                saveUser(user);
            }
        } catch (PasswordValidationException e) {
            System.out.println(e.getMessage());
        }
    }

    public void saveUser(User user) {
        System.out.println("User " + user.toString() + " was saved to database!!!");
    }
}
