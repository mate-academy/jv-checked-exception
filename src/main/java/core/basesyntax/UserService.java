package core.basesyntax;

public class UserService {
    private static final String WRONG_PASSWORD_MSG = "Your passwords are incorrect. Try again.";
    private final PasswordValidator passwordValidator = new PasswordValidator();

    public void registerUser(User user) {
        try {
            passwordValidator.validate(user.getPassword(), user.getRepeatPassword());
            saveUser(user);
        } catch (PasswordValidationException e) {
            System.out.println(WRONG_PASSWORD_MSG);
        }
    }

    public void saveUser(User user) {
        System.out.println("User " + user.toString() + " was saved to database!!!");
    }
}
