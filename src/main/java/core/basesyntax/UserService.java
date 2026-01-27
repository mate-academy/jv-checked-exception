package core.basesyntax;

public class UserService {
    public void registerUser(User user) {
        try {
            new PasswordValidator().validate(user.getPassword(), user.getRepeatPassword());
        } catch (PasswordValidationException e) {
            System.out.println(e.getMessage());
        }
        saveUser(user);
    }

    public void saveUser(User user) {
        System.out.println("User " + user.toString() + " was saved to database!!!");
    }
}
