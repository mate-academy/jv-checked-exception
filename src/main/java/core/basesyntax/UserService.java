package core.basesyntax;

public class UserService {
    private static final String MISTAKE_MESSAGE = "Your passwords are incorrect. Try again.";

    public void registerUser(User user) {
        PasswordValidator passwordValidator = new PasswordValidator();
        try {
            passwordValidator.validate(user.getPassword(), user.getRepeatPassword());
            saveUser(user);
        } catch (PasswordValidationException e) {
            e.printStackTrace();
            System.out.println(MISTAKE_MESSAGE);
        }
    }

    public void saveUser(User user) {
        System.out.println("User " + user.toString() + " was saved to database!!!");
    }
}
