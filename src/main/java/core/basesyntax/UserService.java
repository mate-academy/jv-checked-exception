package core.basesyntax;

public class UserService {
    public static final PasswordValidator passwordValidator = new PasswordValidator();

    public void registerUser(User user) {
        if (user.getPassword().length() >= 10
                && user.getPassword().equals(user.getRepeatPassword())) {
            saveUser(user);
        } else {
            passwordValidator.validate(user.getPassword(), user.getRepeatPassword());
        }
    }

    public void saveUser(User user) {
        System.out.println("User " + user.toString() + " was saved to database!!!");
    }
}
