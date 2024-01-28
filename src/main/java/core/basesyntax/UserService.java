package core.basesyntax;

public class UserService {
    public void registerUser(User user) {
        try {
            PasswordValidator.validate(user.getPassword(), user.getRepeatPassword());
            saveUser(user);
        } catch (PasswordValidationException e) {
            throw new PasswordValidationException(
            "Your passwords are incorrect. Try again."
            + e.getMessage() + e);
        }
        //write your code here
    }

    public void saveUser(User user) {
        System.out.println("User "
                + user.toString()
                + " was saved to database!!!");
    }
}
