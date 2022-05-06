package core.basesyntax;

public class UserService {
    public static void registerUser(User user) {
        try {
            PasswordValidator.validate(user.getPassword(), user.getRepeatPassword());
            saveUser(user);
        } catch (PasswordValidationException e) {
            System.out.println("Your passwords are incorrect. Try again.");
        }
    }

    private static void saveUser(User user) {
        System.out.println("User " + user.toString() + " was saved to database!!!");
    }
}
