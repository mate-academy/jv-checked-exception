package core.basesyntax;

public class UserService {
    public void registerUser(User user) {
        //write your code here
        PasswordValidator CheckPass = new PasswordValidator();
        try {
            CheckPass.validate(user.getPassword(), user.getRepeatPassword());
            this.saveUser(user);
        } catch (PasswordValidationException e) {
            //throw new RuntimeException(e);
            System.out.println("Your passwords are incorrect. Try again.");
        }
    }

    public void saveUser(User user){
        System.out.println("User " + user.toString() + " was saved to database!!!");
    }
}
