package core.basesyntax;

public class UserService {
    public void registerUser(User user) {
        PasswordValidator validator = new PasswordValidator();
        try {
            validator.validate(user.getPassword(), user.getRepeatPassword());
            saveUser(user);
        } catch (IllegalArgumentException e) {
            System.out.println("Wrong passwords");
        }
    }

    public void saveUser(User user) {
        System.out.println("User " + user.toString() + " was saved to database!!!");
    }
}

