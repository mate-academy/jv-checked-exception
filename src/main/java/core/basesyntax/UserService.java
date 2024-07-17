package core.basesyntax;

public class UserService {
    private static final PasswordValidator passwordValidator = new PasswordValidator();

    public void registerUser(User user) {
        if (user.equals(passwordValidator)) {
            saveUser(user);
        }
        throw new RuntimeException("Your passwords are incorrect. Try again.");
    }

    public void saveUser(User user) {
        System.out.println("User " + user.toString() + " was saved to database!!!");
    }
}
