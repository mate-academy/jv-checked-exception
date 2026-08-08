package core.basesyntax;

public class UserService extends PasswordValidator {
    public void registerUser(User user) {
        try {
            PasswordValidator validator = new PasswordValidator();
            validator.validate(user.getPassword(), user.getRepeatPassword());
            saveUser(user);
        } catch (PasswordValidationException e) {
            System.out.println("Your passwords are incorrect. Try again.");
        }
        //write your code here
    }

    public void saveUser(User user) {
        System.out.println("User " + user.toString() + " was saved to database!!!");
    }
}
