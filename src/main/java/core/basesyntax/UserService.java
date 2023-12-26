package core.basesyntax;

public class UserService {
    public void registerUser(User user) {
        //write your code here
        try {
            PasswordValidator validator = new PasswordValidator();
            validator.validate(user.getPassword(), user.getRepeatPassword());
            saveUser(user);
        } catch (PasswordValidationException e) {
            throw new RuntimeException("Your passwords are incorrect. Try again");
        }
    }

    public void saveUser(User user) {
        System.out.println("User " + user.toString() + " was saved to database!!!");
    }
}
