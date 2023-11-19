package core.basesyntax;

public class UserService {
    public void registerUser(User user) {
        PasswordValidator passwordValidator = new PasswordValidator();

        try {
            passwordValidator.validate(user.getPassword(), user.getRepeatPassword());
        } catch (PasswordValidationException e) {
            System.out.println("Your passwords are incorrect. Try again.");
            return;
        }
        user.setPassword(user.getPassword());
        user.setRepeatPassword(user.getRepeatPassword());
        saveUser(user);
    }

    public void saveUser(User user) {
        System.out.println("User " + user.toString() + " was saved to database!!!");
    }
}
