package core.basesyntax;

public class UserService {
   private PasswordValidator passwordValidator = new PasswordValidator();
    private UserService userService = new UserService();

    public void registerUser(User user) {
        try {
            passwordValidator.validate("123456789", "123456789");
        } catch (Exception e) {
            System.out.println("Your passwords are incorrect. Try again.");
        }
        userService.saveUser(user);
    }

    public void saveUser(User user) {
        System.out.println("User " + user.toString() + " was saved to database!!!");
    }
}
