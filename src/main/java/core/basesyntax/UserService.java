package core.basesyntax;

public class UserService extends PasswordValidator {
    public void registerUser(User user) {
        //write your code here
        try {
            if (validate(user.getPassword(), user.getRepeatPassword()) == true) {
                saveUser(user);
            }
        } catch (PasswordValidationException passwordValidationException) {
            System.out.println("Your passwords are incorrect. Try again.");
        }
    }

    public void saveUser(User user) {
        System.out.println("User " + user.toString() + " was saved to database!!!");
    }
}
