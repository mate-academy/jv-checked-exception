package core.basesyntax;

public class UserService {
    private PasswordValidator validator = new PasswordValidator();

    public void registerUser(User user) {
        if (validator != null) {
            saveUser(user);
        }
    }

    public void saveUser(User user) {
        System.out.println("User " + user.toString() + " was saved to database!!!");
    }
}
