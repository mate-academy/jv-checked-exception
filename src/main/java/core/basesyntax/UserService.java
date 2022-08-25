package core.basesyntax;

public class UserService {
    private static final PasswordValidator passwordValidator = new PasswordValidator();
    public void registerUser(User user) {
        try {
            passwordValidator.validate(user.getPassword(), user.getRepeatPassword());
            saveUser(user);
        } catch (NullPointerException | PasswordValidationException e) {
            System.out.println("Null input data");
        }
    }

    public void saveUser(User user) {
        System.out.println("User " + user.toString() + " was saved to database!!!");
    }
}
