package core.basesyntax;

public class UserService {
    private final PasswordValidator passValidator = new PasswordValidator();

    public void registerUser(User user) {
        try {
            passValidator.validate(user.getPassword(), user.getRepeatPassword());
        } catch (PasswordValidationException pve) {
            System.out.println("Your passwords are incorrect. Try again.");
            return;
        }
        saveUser(user);
    }

    public void saveUser(User user) {
        System.out.println("User " + user.toString() + " was saved to database!!!");
    }
}
