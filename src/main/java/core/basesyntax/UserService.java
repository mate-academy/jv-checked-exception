package core.basesyntax;

public class UserService {

    public void registerUser(User user) {
        //write your code here
        PasswordValidator passwordValidator = new PasswordValidator();
        try {
            if (user.getPassword() != null || user.getRepeatPassword() != null) {
                passwordValidator.validate(user.getPassword(), user.getRepeatPassword());
                saveUser(user);
            }
        } catch (PasswordValidationException e) {
            System.out.println(e.getMessage());
        }
    }

    public void saveUser(User user) {
        System.out.println("User " + user.toString() + " was saved to database!!!");
    }
}
