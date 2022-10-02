package core.basesyntax;

public class UserService {
    private static final PasswordValidator PASSWORD_VALIDATOR = new PasswordValidator();

    public void registerUser(User user) {
        try {
            PASSWORD_VALIDATOR.validate(user.getRepeatPassword(), user.getRepeatPassword());
            saveUser(user);
        } catch (PasswordValidationException e) {
            System.out.println("Your passwords are incorrect. Try again.");
        }
    }

    public void saveUser(User user) {
        System.out.println("User " + user.toString() + " was saved to database!!!");
    }
}
