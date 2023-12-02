package core.basesyntax;

public class UserService {
    private final PasswordValidator passwordValidator = new PasswordValidator();

    public void registerUser(User user) {
        boolean isValid = false;
        try {
            isValid = passwordValidator.validate(user.getPassword(), user.getRepeatPassword());
        } catch (PasswordValidationException pve) {
            System.out.println("Your passwords are incorrect. Try again.");
        }
        if (isValid) {
            saveUser(user);
        }
    }

    public void saveUser(User user) {
        System.out.println("User " + user.toString() + " was saved to database!!!");
    }
}
