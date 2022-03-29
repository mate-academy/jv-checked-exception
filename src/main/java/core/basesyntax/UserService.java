package core.basesyntax;

public class UserService {

    public void registerUser(User user) {
        try {
            PasswordValidator passwordValidator = new PasswordValidator();
            passwordValidator.validate(user.getPassword(), user.getRepeatPassword());
        } catch (PasswordValidationException e) {
            System.out.println("Your passwords are incorrect. Try again.");
            return;
        }
        saveUser(user);
    }

    public void saveUser(User user) {
        System.out.println("User " + user.toString()
                + " was saved to database!!!");
    }
}
