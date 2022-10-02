package core.basesyntax;

public class UserService {
    public static final String CATCH_MESSAGE = "Your passwords are incorrect. Try again.";

    public void registerUser(User user) {
        try {
            new PasswordValidator().validate(user.getPassword(), user.getRepeatPassword());
            saveUser(user);
        } catch (Exception e) {
            System.out.println(CATCH_MESSAGE);
        }
    }

    public void saveUser(User user) {
        System.out.println("User " + user.toString() + " was saved to database!!!");
    }
}
