package core.basesyntax;

public class UserService {
    private static final String PASSWORD_EXCEPTION_MESSAGE =
            "Your passwords are incorrect. Try again.";
    private final PasswordValidator passwordValidator = new PasswordValidator();

    public void registerUser(User user) {
        try {
            passwordValidator.validate(user.getPassword(), user.getRepeatPassword());
            saveUser(user);
        } catch (PasswordValidationException e) {
            System.out.println(PASSWORD_EXCEPTION_MESSAGE);
        }
    }

    public void saveUser(User user) {
        System.out.println("User " + user.toString() + " was saved to database!!!");
    }
}
