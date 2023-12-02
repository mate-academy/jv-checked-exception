package core.basesyntax;

public class UserService {
    private PasswordValidator passwordValidator = new PasswordValidator();

    public void registerUser(User user) {
        UserService userService = new UserService();
        try {
            if (user.getPassword() != null && user.getRepeatPassword() != null) {
                passwordValidator.validate(user.getPassword(), user.getRepeatPassword());
                userService.saveUser(user);
            }
        } catch (PasswordValidationException e) {
            System.out.println("Your passwords are incorrect. Try again.");
        }
    }

    public void saveUser(User user) {
        System.out.println("User " + user.toString() + " was saved to database!!!");
    }
}
