package core.basesyntax;

public class UserService {

    public void registerUser(User user1) {
        try {
            PasswordValidator.validate(user1.getPassword(), user1.getRepeatPassword());
            saveUser(user1);
        } catch (PasswordValidationException e) {
            System.out.println("Your passwords are incorrect. Try again.");
        }
    }
    public void saveUser(User user) {
        System.out.println("User " + user.toString() + " was saved to database!!!");
    }
}
