package core.basesyntax;

public class UserService {
    public void registerUser(User user) {
        try {
            PasswordValidator passwordValidator = new PasswordValidator();
            passwordValidator.validate(user.getPassword(), user.getRepeatPassword());
            saveUser(user);
        } catch (Exception e) {
            throw new RuntimeException("Your passwords are incorrect. Try again." + e);
        }
    }

    public void saveUser(User user) {
        System.out.println("User " + user.toString() + " was saved to database!!!");
    }
}
