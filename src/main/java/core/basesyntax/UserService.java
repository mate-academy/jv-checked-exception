package core.basesyntax;

public class UserService {
    private static final String NEW_PASSWORD = "Password#123";
    private static final String REPEAT_NEW_PASSWORD = "Password#123";
    private static final String EMAIL = "email@email";
    private PasswordValidator passwordValidator = new PasswordValidator();
    private User user = new User(EMAIL, NEW_PASSWORD, REPEAT_NEW_PASSWORD);

    public void registerUser(User user) {
        try {
            passwordValidator.validate(user.getPassword(), user.getRepeatPassword());
            saveUser(user);
        } catch (PasswordValidationException e) {
            System.out.println("Your passwords are incorrect. Try again.");
        }
    }

    public void saveUser(User user) {
        System.out.println("User " + user.toString() + " was saved to database!!!");
    }
}
