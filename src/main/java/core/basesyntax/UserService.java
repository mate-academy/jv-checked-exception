package core.basesyntax;

public class UserService {
    public static void registerUser(User user) {
        PasswordValidator passwordValidator = new PasswordValidator();
        try {
            passwordValidator.validate(user.getPassword(), user.getRepeatPassword());
        } catch (PasswordValidationException pas) {
            System.out.println("Your passwords are incorrect. Try again.");
            return;
        }
        UserService.saveUser(user);
    }

    public static void saveUser(User user) {
        System.out.println("User " + user.toString() + " was saved to data base!!!");
    }
}
