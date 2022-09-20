package core.basesyntax;

public class UserService extends PasswordValidator {
    public void registerUser(User user) {
        //write your code here
        try {
            validate(user.getPassword(), user.getRepeatPassword());
        } catch (PasswordValidationException e) {
            System.out.println("Your passwords are incorrect. Try again.");
        }
        if ((user.getPassword().equals(user.getRepeatPassword()))
                & user.getPassword().length() >= 10) {
            saveUser(user);
        }
    }

    public void saveUser(User user) {
        System.out.println("User " + user.toString() + " was saved to database!!!");
    }
}
