package core.basesyntax;

public class UserService {
    public void registerUser(User user) {
        //write your code here
        PasswordValidator pw = new PasswordValidator();
        try {
            pw.validate(user.getPassword(), user.getRepeatPassword());
            saveUser(user);
        } catch (PasswordValidationException ex) {
            System.out.println(ex.getMessage());
            System.out.println("Your passwords are incorrect. Try again.");
        }
    }

    public void saveUser(User user) {
        System.out.println("User " + user.toString() + " was saved to database!!!");
    }
}
