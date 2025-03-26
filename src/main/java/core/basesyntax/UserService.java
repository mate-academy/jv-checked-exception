package core.basesyntax;

public class UserService {
    public void registerUser(User user) {
        //write your code here
        PasswordValidator validator = new PasswordValidator();

        try {
            validator.validate(user.getPassword(), user.getRepeatPassword());
        } catch (PasswordValidationException e) {
            throw new PasswordValidationException("Your passwords are incorrect. Try again.");
        }

        saveUser(user);
    }

    public void saveUser(User user) {
        System.out.println("User " + user.toString() + " was saved to database!!!");
    }
}
