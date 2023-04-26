package core.basesyntax;

public class UserService {
    public void registerUser(User user) {
        boolean saveUser = true;
        try {
            PasswordValidator passwordValidator = new PasswordValidator();
            passwordValidator.validate(user.getPassword(), user.getRepeatPassword());
        } catch (PasswordValidationException e) {
            System.out.println("Your passwords are incorrect. Try again.");
            saveUser = false;
        }
        if (saveUser) {
            saveUser(user);
        }

    }

    public void saveUser(User user) {
        System.out.println("User " + user.toString() + " was saved to database!!!");
    }
}
